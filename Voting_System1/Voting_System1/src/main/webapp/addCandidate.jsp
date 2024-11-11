<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    .form-container {
        background: white;
        max-width: 400px;
        margin: 50px auto;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
        text-align: center;
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

    input[type="text"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    button {
        width: 100%;
        padding: 10px;
        background-color: #5cb85c;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    button:hover {
        background-color: #4cae4c;
    }

    .success {
        color: #5cb85c;
        text-align: center;
        margin-top: 15px;
    }

    .error {
        color: #d9534f;
        text-align: center;
        margin-top: 15px;
    }

    .button {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 15px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        transition: background-color 0.3s;
    }

    .button:hover {
        background-color: #0056b3;
    }
</style>

<main>
    <div class="form-container">
        <h2>Add New Candidate</h2>
        <form action="AddCandidateServlet" method="post">
            <div class="input-group">
                <label for="candidateName">Candidate Name:</label>
                <input type="text" id="candidateName" name="candidateName" required>
            </div>

            <button type="submit">Add Candidate</button>
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