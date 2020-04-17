package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Praretno",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0){
            System.out.println("Invalid value entered");
        }

        double foot = calcFeetAndInchesToCentimeters(120);
        if (foot < 0) {
            System.out.println("Invalid value entered");
        }
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
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54d;
        centimeters += (inches * 2.54d);
        System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = inches % 12;
        System.out.println(inches + " inches = " + feet + " feet + " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
