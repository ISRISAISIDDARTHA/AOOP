<%@ page import="java.util.ArrayList, Voting_System.Candidate, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
    <h2>Vote Casting</h2>
    
    <form action="CastVoteServlet" method="post">
        <label>Select a Candidate:</label>
        <select name="candidateName" required>
            <% 
                // Retrieve candidates from application scope and ensure it's of the correct type
                Object candidateObj = application.getAttribute("candidates");
                List<Candidate> candidates = new ArrayList<>(); // initialize an empty list

                if (candidateObj instanceof List<?>) {
                    for (Object obj : (List<?>) candidateObj) {
                        if (obj instanceof Candidate) {
                            candidates.add((Candidate) obj); // safely add Candidate objects
                        }
                    }
                }

                if (!candidates.isEmpty()) {
                    for (Candidate candidate : candidates) {
            %>
                        <option value="<%= candidate.getName() %>"><%= candidate.getName() %></option>
            <% 
                    }
                } else {
            %>
                    <option disabled>No candidates available</option>
            <% 
                }
            %>
        </select><br><br>

        <button type="submit">Cast Vote</button>
    </form>

    <% if (request.getParameter("success") != null) { %>
        <p class="success"><%= request.getParameter("success") %></p>
    <% } else if (request.getParameter("error") != null) { %>
        <p class="error"><%= request.getParameter("error") %></p>
    <% } %>

    <a href="index.jsp" class="button">Logout</a>
</main>

<%@ include file="footer.jsp" %>
