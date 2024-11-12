package com.voter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/VoterEligibilityServlet")
public class VoterEligibilityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        String name = request.getParameter("name");
        String ageParam = request.getParameter("age");
        PrintWriter out = response.getWriter();
        
        // Validate that age is a valid integer
        int age;
        try {
            age = Integer.parseInt(ageParam);
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Invalid input. Please enter a valid age.</h2>");
            out.println("</body></html>");
            return;
        }
        
        // Check voter eligibility
        out.println("<html><body>");
        if (age >= 18) {
            out.println("<h2>Hello " + name + ", you are eligible to vote!</h2>");
        } else {
            out.println("<h2>Hello " + name + ", you are not eligible to vote yet.</h2>");
        }
        out.println("</body></html>");
    }
}
