package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Praretno",500);
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    // Method overloading : Using the same method but with different number of parameters
}
