package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Praretno",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(1,1) + " cm");
        System.out.println(calcFeetAndInchesToCentimeters(12) + " feet");
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

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            return ((feet * 30.48d) + (inches * 2.54d));
        } return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            return (inches / 12);
        } return -1;
    }
}
