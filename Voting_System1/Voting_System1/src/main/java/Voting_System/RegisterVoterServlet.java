package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterVoterServlet")
public class RegisterVoterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Admin admin = (Admin) getServletContext().getAttribute("admin");
        if (admin == null) {
            throw new ServletException("Admin object not initialized.");
        }

        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        if (userID.matches("\\d{5}")) {
            admin.registerVoter(userID, password);
            response.sendRedirect("registerVoter.jsp?success=Voter registered successfully");
        } else {
            response.sendRedirect("registerVoter.jsp?error=User ID must be 5 digits");
        }
    }
}
