import java.util.Scanner;
import java.util.Random;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter your choice (Rock/Paper/Scissors): ");
        String player = sc.nextLine();

        int computerIndex = random.nextInt(3);
        String computer = choices[computerIndex];

        System.out.println("Computer chose: " + computer);

        if (player.equalsIgnoreCase(computer)) {
            System.out.println("It's a Tie!");
        }
        else if (
            (player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
        ) {
            System.out.println("Player wins!");
        }
        else if (
            player.equalsIgnoreCase("Rock") ||
            player.equalsIgnoreCase("Paper") ||
            player.equalsIgnoreCase("Scissors")
        ) {
            System.out.println("Computer wins!");
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}