<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    main {
        max-width: 800px;
        margin: 50px auto;
        padding: 20px;
        background: white;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }

    .form-container {
        text-align: center;
    }

    h2 {
        color: #333;
    }

    .input-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        color: #555;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    button {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    button:hover {
        background-color: #0056b3;
 }

    .success {
        color: green;
        text-align: center;
        margin-top: 10px;
    }

    .error {
        color: red;
        text-align: center;
        margin-top: 10px;
    }

    .button {
        background-color: #333;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    .button:hover {
        background-color: #555;
    }
</style>

<main>
    <div class="form-container">
        <h2>Register New Voter</h2>
        <form action="RegisterVoterServlet" method="post">
            <div class="input-group">
                <label for="userID">Voter ID (5 digits):</label>
                <input type="text" id="userID" name="userID" required pattern="\d{5}">
            </div>

            <div class="input-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>

            <button type="submit">Register</button>
        </form>

        <% if (request.getParameter("success") != null) { %>
            <p class="success"><%= request.getParameter("success") %></p>
        <% } else if (request.getParameter("error") != null) { %>
            <p class="error"><%= request.getParameter("error") %></p>
        <% } %>

        <a href="adminPanel.jsp" class="button">Back to Admin Panel</a>
    </div>
</main>

<%@ include file="footer.jsp" %>