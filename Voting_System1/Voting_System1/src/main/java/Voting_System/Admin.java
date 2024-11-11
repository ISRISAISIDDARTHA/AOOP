package Voting_System;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Voter> voters;
    private List<Candidate> candidates;

    private final String adminUsername = "admin";
    private final String adminPassword = "admin123";

    public Admin() {
        this.voters = new ArrayList<>();
        this.candidates = new ArrayList<>();
    }

    
    public boolean validateAdmin(String username, String password) {
        return adminUsername.equals(username) && adminPassword.equals(password);
    }

    public void registerVoter(String userID, String password) {
        for (Voter voter : voters) {
            if (voter.getUserID().equals(userID)) {
                System.out.println("Voter with ID " + userID + " already exists.");
                return;
            }
        }
        voters.add(new Voter(userID, password));
        System.out.println("Voter registered successfully with ID: " + userID);
    }

    public void addCandidate(String candidateName) {
        candidates.add(new Candidate(candidateName));
        System.out.println("Candidate " + candidateName + " added successfully.");
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public List<Voter> getVoters() {
        return voters;
    }
}
