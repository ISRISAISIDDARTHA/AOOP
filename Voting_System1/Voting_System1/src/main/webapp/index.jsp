<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<style>
    main {
        max-width: 800px;
        margin: 50px auto;
        padding: 20px;
        background: white;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    h2 {
        color: #333;
    }

    p {
        color: #555;
    }

    .options {
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
    <h2>Welcome to the Voting System</h2>
    <p>Please choose an option:</p>
    <div class="options">
        <a href="voterLogin.jsp" class="button">Voter Login</a>
        <a href="adminLogin.jsp" class="button">Admin Login</a>
    </div>
</main>

<%@ include file="footer.jsp" %>