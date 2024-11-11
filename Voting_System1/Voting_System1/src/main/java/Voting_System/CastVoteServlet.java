package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/CastVoteServlet")
public class CastVoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Voter voter = (Voter) session.getAttribute("voter");

        // Check if the user is logged in as a voter
        if (voter == null) {
            response.sendRedirect("voterLogin.jsp?error=You must be logged in to vote.");
            return;
        }

        // Check if the voter has already voted
        if (voter.hasVoted()) {
            response.sendRedirect("voterPanel.jsp?error=You have already voted.");
            return;
        }

        // Retrieve candidate name from the form
        String candidateName = request.getParameter("candidateName");

        // Retrieve the list of candidates from application scope
        Object candidateObj = getServletContext().getAttribute("candidates");
        if (!(candidateObj instanceof List<?>)) {
            response.sendRedirect("voterPanel.jsp?error=Candidate list not found.");
            return;
        }

        @SuppressWarnings("unchecked")
		List<Candidate> candidates = (List<Candidate>) candidateObj;
        boolean voteSuccess = false;

        // Attempt to find and update the selected candidate's vote count
     // Inside CastVoteServlet's doPost method
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(candidateName)) {
                candidate.incrementVotes(); // This should now work
                voteSuccess = true;
                break;
            }
        }


        if (voteSuccess) {
            // Mark the voter as having voted
            voter.setHasVoted(true);
            session.setAttribute("voter", voter); // Update the voter in the session
            response.sendRedirect("voterPanel.jsp?success=Your vote has been successfully cast.");
        } else {
            // If there was an error in casting the vote
            response.sendRedirect("voterPanel.jsp?error=There was an error casting your vote.");
        }
    }
}
