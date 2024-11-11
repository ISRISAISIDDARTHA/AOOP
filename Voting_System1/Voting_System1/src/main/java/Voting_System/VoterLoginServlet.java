package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/VoterLoginServlet")
public class VoterLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        // Retrieve the admin object from the application context
        Admin admin = (Admin) getServletContext().getAttribute("admin");

        // Check if admin exists and validate the voter
        if (admin != null) {
            Voter voter = findVoter(admin, userID, password);
            if (voter != null) {
            	// In the VoterLoginServlet
            	HttpSession session = request.getSession();
            	session.setAttribute("voter", voter); // Store voter in session

            	
                response.sendRedirect("voterPanel.jsp"); // Redirect to voter panel
            } else {
                response.sendRedirect("voterLogin.jsp?error=Invalid Voter ID or Password");
            }
        } else {
            throw new ServletException("Admin object not initialized.");
        }
    }

    private Voter findVoter(Admin admin, String userID, String password) {
        for (Voter voter : admin.getVoters()) {
            if (voter.getUserID().equals(userID) && voter.getPassword().equals(password)) {
                return voter; // Return voter if credentials match
            }
        }
        return null; // Return null if no match found
    }
}

