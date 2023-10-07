package tasks;

import utils.Utils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Arrays {
    public static void inputSum(){
        int[] arr = new int[4];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 4 numbers below, enter after each input");

        arr[0] = parseInt(scn.nextLine());
        arr[1] = parseInt(scn.nextLine());
        arr[2] = parseInt(scn.nextLine());
        arr[3] = parseInt(scn.nextLine());

        System.out.println("Your Input: " + java.util.Arrays.toString(arr));

        int index; int sum = 0;
        for(index = 0; index < arr.length; index++){
            sum += arr[index];
        }
        System.out.println("The sum of your numbers: " + sum);
    }

    public static int[] tenRandomInt(){
        int[] random = new int[10];
        int index;
        for(index = 0; index < 10; index++){
            random[index] = Utils.randomNumber();
        }
        System.out.println("Array of 10 random integers: " + java.util.Arrays.toString(random));
        return random;
    }

    public static void biggestInt(){
        int[] random = tenRandomInt();

        int index;
        int max = 0; // Annahme: Das erste Element ist das größte
        int i = 0; // Index des (angenommenen) größten Elements

        for (index = 1; index < random.length; index++) {
            if (random[index] > max) {
                max = random[index];
                i  = index;
            }
        }
        System.out.println("Biggest number in the Array: " + max + " - Index: " + i);
    }

    public static void reverseString(String str){
        char[] charArray = str.toCharArray();
        Utils.reverse(charArray);
        System.out.println("spelled backwards: " + new String(charArray));
    }
}
