package Voting_System;

public class Voter {
    private String userID;
    private String password;
    private boolean hasVoted;

    public Voter(String userID, String password) {
        this.userID = userID;
        this.password = password;
        this.hasVoted = false; // Voter starts with hasVoted set to false
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
