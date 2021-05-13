package com.company;

public class Main {
    public static void main(String[] args) {
        int playerAPosition = calculateHighScorePosition(1000);
        int playerBPosition = calculateHighScorePosition(500);
        int playerCPosition = calculateHighScorePosition(100);
        int playerDPosition = calculateHighScorePosition(50);

        displayHighScorePosition("A", playerAPosition);
        displayHighScorePosition("B", playerBPosition);
        displayHighScorePosition("C", playerCPosition);
        displayHighScorePosition("D", playerDPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + "!");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
