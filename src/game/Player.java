package game;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    int number;

    void guess() {
        number = scanner.nextInt();
    }
}
