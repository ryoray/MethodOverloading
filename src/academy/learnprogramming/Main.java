package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Praretno",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Method overloading : Using the same method but with different number of parameters
    // The signature to distinguish overloaded methods one with another is the parameters
    // If they are all just the same, then it will be recognized as the same method (duplicated)

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored  " + score);
        return score * 1000;
    }

    public static void calculateScore () {
        System.out.println("No player name, no player score");
    }
}
