package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Admin admin = (Admin) getServletContext().getAttribute("admin");

        if (admin != null && admin.validateAdmin(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("isAdminLoggedIn", true); 
            response.sendRedirect("adminPanel.jsp");
        } else {
            response.sendRedirect("adminLogin.jsp?error=Invalid username or password");
        }
    }
}

