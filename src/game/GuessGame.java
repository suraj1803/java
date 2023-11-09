package game;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    int guessP1 = 0;
    int guessP2 = 0;
    int guessP3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int secretNumber = (int) (10 * Math.random());

        while (true) {
//            System.out.println("Number to guess is " + secretNumber);
            System.out.print("Player 1 is guessing: ");
            player1.guess();
            System.out.print("Player 2 is guessing: ");
            player2.guess();
            System.out.print("Player 3 is guessing: ");
            player3.guess();

            guessP1 = player1.number;
            guessP2 = player2.number;
            guessP3 = player3.number;

            if (guessP1 == secretNumber)
                p1isRight = true;
            if (guessP2 == secretNumber)
                p2isRight = true;
            if (guessP3 == secretNumber)
                p3isRight = true;
//            p1isRight = (guessP1 == secretNumber);
//            p2isRight = (guessP2 == secretNumber);
//            p3isRight = (guessP3 == secretNumber);

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 one got it right? " + p1isRight);
                System.out.println("Player 2 one got it right? " + p2isRight);
                System.out.println("Player 3 one got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again!");
            }

        }
    }
}
