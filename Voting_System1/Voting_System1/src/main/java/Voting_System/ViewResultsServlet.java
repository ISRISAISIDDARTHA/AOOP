package Voting_System;

import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@SuppressWarnings({ "serial" })
@WebServlet("/ViewResultsServlet")
public class ViewResultsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the admin object from the servlet context
        Admin admin = (Admin) getServletContext().getAttribute("admin");

        // Get the candidates from the admin
        List<Candidate> candidates = admin.getCandidates();
        
        // Set the candidates as a request attribute
        request.setAttribute("candidates", candidates);
        
        // Forward the request to results.jsp
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
