package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@WebServlet("/AddCandidateServlet")
public class AddCandidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String candidateName = request.getParameter("candidateName");

        // Retrieve or initialize the list of candidates from application scope
        @SuppressWarnings("unchecked")
		List<Candidate> candidates = (List<Candidate>) getServletContext().getAttribute("candidates");
        if (candidates == null) {
            candidates = new ArrayList<>();
        }

        // Add the new candidate to the list
        candidates.add(new Candidate(candidateName));

        // Update the candidates list in the application scope
        getServletContext().setAttribute("candidates", candidates);

        // Redirect with a success message
        response.sendRedirect("addCandidate.jsp?success=Candidate added successfully");
    }
}
