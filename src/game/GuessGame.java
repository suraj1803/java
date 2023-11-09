package game;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public int distance(int secretNumber, int num) {
        return (secretNumber >= num) ? secretNumber - num : num - secretNumber;
    }

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int secretNumber = (int) (100 * Math.random() + 1);

        System.out.print("Player 1 is guessing: ");
        player1.guess();
        System.out.print("Player 2 is guessing: ");
        player2.guess();
        System.out.print("Player 3 is guessing: ");
        player3.guess();

        int distance1 = distance(secretNumber, player1.number);
        int distance2 = distance(secretNumber, player2.number);
        int distance3 = distance(secretNumber, player3.number);

        int smallestDistance = min(distance1, distance2, distance3);

        if (smallestDistance == distance1)
            System.out.println("Player 1 wins!");
        else if (smallestDistance == distance2)
            System.out.println("Player 2 wins!");
        else
            System.out.println("Player 3 wins!");

        System.out.println("Game is over.");
        System.out.println("The secret number was " + secretNumber);
    }
}
