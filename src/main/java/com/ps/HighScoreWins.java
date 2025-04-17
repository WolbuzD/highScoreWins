package com.ps;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        System.out.println("Hello, welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a game score: ");
        String inputReceived = scanner.nextLine().trim();

        String[] allParts = inputReceived.split("\\|");

        String[] teams = allParts[0].split(":");
        String[] scores = allParts[1].split(":");

        String team1 = teams[0].trim();
        String team2 = teams[1].trim();
        int score1 = Integer.parseInt(scores[0].trim());
        int score2 = Integer.parseInt(scores[1].trim()); // Fixed here

        String winner;
        if(score1 > score2){
            winner = team1;
        } else if(score1 < score2){
            winner = team2; // Fixed here
        } else {
            winner = "It's a tie!";
        }

        System.out.printf("Yayyyy! The winner is: %s%n", winner);

        scanner.close();
    }
}
