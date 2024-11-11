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

    h2 {
        text-align: center;
        color: #333;
    }

    p {
        text-align: center;
        color: #555;
    }

    .admin-options {
        display: flex;
        flex-direction: column;
        align-items: center;
        margin-top: 20px;
    }

    .button {
        display: inline-block;
        margin: 10px 0;
        padding: 10px 15px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        transition: background-color 0.3s;
        width: 200px;
        text-align: center;
    }

    .button:hover {
        background-color: #0056b3;
    }
</style>

<main>
    <h2>Admin Panel</h2>
    <p>Manage your voting system:</p>
    <div class="admin-options">
        <a href="registerVoter.jsp" class="button">Register New Voter</a>
        <a href="addCandidate.jsp" class="button">Add New Candidate</a>
        <a href="ViewResultsServlet" class="button">View Election Results</a>
        <a href="AdminLogoutServlet" class="button">Logout</a>
    </div>
</main>

<%@ include file="footer.jsp" %>
