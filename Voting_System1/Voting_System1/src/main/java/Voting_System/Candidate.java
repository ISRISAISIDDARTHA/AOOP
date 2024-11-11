package Voting_System;

public class Candidate {
    private String name;
    private int voteCount; // Add a voteCount attribute to track votes

    // Constructor
    public Candidate(String name) {
        this.name = name;
        this.voteCount = 0; // Initialize vote count to 0
    }

    // Getter for candidate name
    public String getName() {
        return name;
    }

    // Getter for vote count
    public int getVoteCount() {
        return voteCount;
    }

    // Method to increment vote count
    public void incrementVotes() {
        this.voteCount++;
    }
}
