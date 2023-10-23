import tasks.*;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        /*Output.hello();

        Variables.output(56);
        Variables.square(4);
        Variables.convertTemp(100);
        Variables.convertTime(1234567890);


        Branching.checkEven(35);
        Branching.isInRange(234, new int[]{100, 500});
        Branching.divisibleBy_OR(237, new int[]{2, 3});
        Branching.convertNote(5);
        Branching.sortThreeRandomNumbers();


        Loops.loopTypes();
        Loops.count(10);
        Loops.arrayCount(1000);
        Loops.sum(100);
        Loops.sawTooth(5, 1);


        System.out.println(
                Methods.sum(new int[]{10, 13}));
        System.out.println(
                Methods.name());
        System.out.println(
                Methods.checkEven(32));
        System.out.println(Arrays.toString(
                Methods.randomArr(10)));
        System.out.println(
                Methods.sumInterval(15, 29));
        System.out.println(
                Methods.biggestNumber(new int[]{12, 54, -34, -16}));
        System.out.println(
                Methods.sum(new int[]{230, 123, 234}));*/
        System.out.println(
                Methods.checkPrime(17));
        /*System.out.println(
                Methods.simpleMath(3,5,"/"));
        System.out.println(
                Methods.circularArea(34.7));
        System.out.println(
                Methods.decToBin(24));
        System.out.println(
                Methods.checkPerfect(8128));


        System.out.println(
                Recursion.plusRecursive(2,5));
        System.out.println(
                Recursion.minusRecursive(5, 2));
        System.out.println(
                Recursion.multRecursive(5, 2));
        System.out.println(
                Recursion.powerRecursive(2, 16));
        System.out.println(
                Recursion.modRecursive(8, 3));
        System.out.println(
                Recursion.fakRecursive(9));
        System.out.println(
                Recursion.gcdRecursive(1024, 512));

                Recursion.hanoi(2, 'A', 'B', 'C');
        System.out.println("Anzahl der Schritte: " + Recursion.steps);


        System.out.println("\n// Java API");
        System.out.println(
                JavaAPI.time());
        System.out.println(Arrays.toString(
                JavaAPI.solveQuadraticEquation(1, 5.0, -8.0)));

        Scanner scn = new Scanner(System.in);
        System.out.print("Wie viele Stellen soll dein Passwort haben? :");
        int length = parseInt(scn.nextLine());
        System.out.print("Buchstaben? (y/n)");
        boolean buchstaben = Objects.equals(scn.nextLine(), "y");
        System.out.print("Zahlen? (y/n)");
        boolean zahlen = Objects.equals(scn.nextLine(), "y");
        System.out.print("Sonderzeichen? (y/n)");
        boolean sonderzeichen = Objects.equals(scn.nextLine(), "y");

        PasswordGenerator.newPass(length, buchstaben, zahlen, sonderzeichen);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen bei Rock, Paper, Scissors!");
        System.out.print("Geben Sie die Anzahl der Runden ein: ");
        int roundCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Möchten Sie gegen den Computer (c) oder einen anderen Spieler (s) spielen? ");
        String opponentChoice = scanner.nextLine().toLowerCase();

        boolean isAgainstComputer = opponentChoice.equals("c");

        RockPaperScissors game = new RockPaperScissors(roundCount, isAgainstComputer);
        game.playGame();

        scanner.close();*/

    }
}