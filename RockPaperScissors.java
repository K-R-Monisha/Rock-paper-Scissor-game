import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🗿📄✂️ Rock-Paper-Scissors Game!");
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine().trim();
        
        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("🎉 You Win!");
        } else {
            System.out.println("😢 You Lose!");
        }
    }
}
