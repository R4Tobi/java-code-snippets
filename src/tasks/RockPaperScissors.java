package tasks;
import java.util.*;


public class RockPaperScissors {
    private int player1Wins = 0;
    private int player2Wins = 0;
    private int ties = 0;
    private int roundCount;
    private boolean isAgainstComputer;

    public RockPaperScissors(int roundCount, boolean isAgainstComputer) {
        this.roundCount = roundCount;
        this.isAgainstComputer = isAgainstComputer;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        for (int round = 1; round <= roundCount; round++) {
            System.out.println("Runde " + round);
            System.out.print("Spieler 1: Wählen Sie rock, paper oder scissors: ");
            String player1Choice = scanner.nextLine().toLowerCase();

            if (!isValidChoice(player1Choice)) {
                System.out.println("Ungültige Wahl. Bitte wählen Sie rock, paper oder scissors.");
                continue;
            }

            String player2Choice;
            if (isAgainstComputer) {
                int computerIndex = random.nextInt(3);
                player2Choice = choices[computerIndex];
                System.out.println("Computer wählt: " + player2Choice);
            } else {
                System.out.print("Spieler 2: Wählen Sie rock, paper oder scissors: ");
                player2Choice = scanner.nextLine().toLowerCase();

                if (!isValidChoice(player2Choice)) {
                    System.out.println("Ungültige Wahl. Bitte wählen Sie rock, paper oder scissors.");
                    continue;
                }
            }

            System.out.println("Spieler 1 wählt: " + player1Choice);
            System.out.println("Spieler 2 wählt: " + player2Choice);

            String result = determineWinner(player1Choice, player2Choice);
            System.out.println(result);

            if (result.equals("Spieler 1 gewinnt")) {
                player1Wins++;
            } else if (result.equals("Spieler 2 gewinnt")) {
                player2Wins++;
            } else {
                ties++;
            }
        }

        System.out.println("Spiel beendet!");
        System.out.println("Spieler 1 Siege: " + player1Wins);
        System.out.println("Spieler 2 Siege: " + player2Wins);
        System.out.println("Unentschieden: " + ties);

        scanner.close();
    }

    private boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private String determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "Unentschieden";
        } else if ((choice1.equals("rock") && choice2.equals("scissors")) ||
                (choice1.equals("paper") && choice2.equals("rock")) ||
                (choice1.equals("scissors") && choice2.equals("paper"))) {
            return "Spieler 1 gewinnt";
        } else {
            return "Spieler 2 gewinnt";
        }
    }
}