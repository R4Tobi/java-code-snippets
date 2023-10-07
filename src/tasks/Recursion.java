package tasks;

public class Recursion {
    public static int plusRecursive(int x, int y) {
        if (y == 0) {
            return x; // Basisfall: Wenn y gleich 0 ist, ist das Ergebnis x
        } else if (y > 0) {
            return plusRecursive(x + 1, y - 1); // y ist positiv, füge 1 zu x hinzu und verringere y um 1
        } else {
            return plusRecursive(x - 1, y + 1); // y ist negativ, subtrahiere 1 von x und erhöhe y um 1
        }
    }

    public static int minusRecursive(int x, int y) {
        if (y == 0) {
            return x; // Basisfall: Wenn y gleich 0 ist, ist das Ergebnis x
        } else if (y > 0) {
            return minusRecursive(x - 1, y - 1); // y ist positiv, subtrahiere 1 von x und 1 von y
        } else {
            return minusRecursive(x + 1, y + 1); // y ist negativ, addiere 1 zu x und 1 zu y
        }
    }

    public static int multRecursive(int x, int y) {
        if (x == 0 || y == 0) {
            return 0; // Basisfall: Wenn x oder y gleich 0 ist, ist das Ergebnis 0
        } else if (y > 0) {
            return x + multRecursive(x, y - 1); // y ist positiv, addiere x zum Ergebnis und verringere y um 1
        } else {
            return -multRecursive(x, -y); // y ist negativ, negiere y und rufe die Methode erneut auf
        }
    }

    public static int powerRecursive(int x, int y) {
        if (y == 0) {
            return 1; // Basisfall: x^0 ist 1
        } else if (y > 0) {
            return x * powerRecursive(x, y - 1); // y ist positiv, multipliziere x mit dem Ergebnis von x^(y-1)
        } else {
            return 1 / (x * powerRecursive(x, -y - 1)); // y ist negativ, berechne den Kehrwert von x^(negatives y)
        }
    }

    public static int modRecursive(int x, int y){
        if (y == 0) {
            throw new ArithmeticException("Teilen mit 0 ist nicht erlaubt.");
        }

        if (x < 0) {
            return modRecursive(x + y, y);
        } else if (x < y) {
            return x;
        } else {
            return modRecursive(x - y, y);
        }
    }

    public static int fakRecursive(int x){
        if (x < 0) {
            throw new IllegalArgumentException("Fakultät ist für negative Zahlen nicht definiert.");
        } else if (x == 0 || x == 1) {
            return 1; // Basisfall: 0! und 1! sind beide gleich 1
        } else {
            return x * fakRecursive(x - 1); // rekursiver Fall: x! = x * (x-1)!
        }
    }

    public static int gcdRecursive(int a, int b){
        if (b == 0) {
            return a; // Der GCD ist a, wenn b gleich 0 ist
        } else {
            return gcdRecursive(b, a % b); // Andernfalls rufen Sie die Methode rekursiv mit (b, a % b) auf
        }
    }

    public static int steps = 0;
    public static void hanoi(int n, char start, char hilfs, char ziel) {
        if (n == 1) {
            System.out.println("Verschiebe Scheibe 1 von " + start + " nach " + ziel);
            steps++;
        } else {
            hanoi(n - 1, start, ziel, hilfs);
            System.out.println("Verschiebe Scheibe " + n + " von " + start + " nach " + ziel);
            steps++;
            hanoi(n - 1, hilfs, start, ziel);
        }
    }
}
