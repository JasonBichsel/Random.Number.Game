package Random.Number.Game;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int zufallszahl = random.nextInt(100) + 1; // Zahl zwischen 1 und 100
        Scanner scanner = new Scanner(System.in);
        int versuch = 0;
        int eingabe = 0;

        System.out.println("Hey! Errate die Zahl zwischen 1 und 100.");
        System.out.println("Viel Spass!");

        while (eingabe != zufallszahl) {
            System.out.print("Dein Tipp: ");
            eingabe = scanner.nextInt();
            versuch++;

            if (eingabe < zufallszahl) {
                System.out.println("Zu klein!");
            } else if (eingabe > zufallszahl) {
                System.out.println("Zu groß!");
            } else {
                System.out.println("Richtig! Du hast die Zahl in " + versuch + " Versuchen erraten.");
            }
        }
        scanner.close();
    }
}