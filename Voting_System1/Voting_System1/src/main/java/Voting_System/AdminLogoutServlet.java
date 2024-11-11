package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AdminLogoutServlet")
public class AdminLogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Invalidate the session to log out the admin
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        // Redirect to the home page (index.jsp)
        response.sendRedirect("index.jsp");
    }
}
