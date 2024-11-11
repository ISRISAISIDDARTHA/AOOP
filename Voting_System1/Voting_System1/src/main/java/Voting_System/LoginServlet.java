package Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private Admin admin;

    @Override
    public void init() {
        
        admin = new Admin();
        
        admin.registerVoter("admin", "admin123");
        
        getServletContext().setAttribute("admin", admin);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        if ("admin".equals(userID) && "admin123".equals(password)) {
            response.sendRedirect("adminPanel.jsp");
        } else {
            for (Voter voter : admin.getVoters()) {
                if (voter.getUserID().equals(userID) && voter.getPassword().equals(password)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("voter", voter);
                    response.sendRedirect("voterPanel.jsp");
                    return;
                }
            }
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }
}



