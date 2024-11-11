<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
    <div class="form-container">
        <h2>Voter Login</h2>
        <form action="VoterLoginServlet" method="post">
            <label for="userID">Voter ID:</label>
            <input type="text" id="userID" name="userID" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit">Login</button>
        </form>

        <% if (request.getParameter("error") != null) { %>
            <p class="error"><%= request.getParameter("error") %></p>
        <% } %>
    </div>
</main>

<%@ include file="footer.jsp" %>