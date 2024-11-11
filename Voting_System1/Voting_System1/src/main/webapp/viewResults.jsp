<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="Voting_System.Candidate" %>

<main>
    <div class="form-container">
        <h2>Election Results</h2>
        
        <table>
            <thead>
                <tr>
                    <th>Candidate Name</th>
                    <th>Vote Count</th>
                </tr>
            </thead>
            <tbody>
                <% 
                @SuppressWarnings("unchecked")
                    List<Candidate> candidates = (List<Candidate>) request.getAttribute("candidates");
                    if (candidates != null && !candidates.isEmpty()) {
                        for (Candidate candidate : candidates) {
                %>
                    <tr>
                        <td><%= candidate.getName() %></td>
                        <td><%= candidate.getVoteCount() %></td>
                    </tr>
                <% 
                        }
                    } else { 
                %>
                    <tr>
                        <td colspan="2">No candidates available.</td>
                    </tr>
                <% 
                    } 
                %>
            </tbody>
        </table>

        <a href="adminPanel.jsp" class="button">Back to Admin Panel</a>
    </div>
</main>

<%@ include file="footer.jsp" %>
