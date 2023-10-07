package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static int sum(int[] args) {
        int value = 0;
        for (int arg : args) {
            value += arg;
        }
        return value;
    }

    public static String name() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        return scn.nextLine();
    }

    public static boolean checkEven(int num){
        return num % 2 == 0;
    }

    public static int[] randomArr(int length){
        int[] arr = new int[length];
        for(int index = 0; index < length; index++){
            arr[index] = (int)(Math.random() * 1000);
        }
        return arr;
    }

    public static int sumInterval(int min, int max){
        int index;
        int sum = 0;
        if(min >= max){
            throw new Error("int min is bigger than int max. | wrong parameters");
        }
        for(index = min; index <= max; index++){
            sum += index;
        }
        return sum;
    }

    public static int biggestNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static boolean checkPrime(int number){
        if(number <= 1) {
            return false;
        }
        for(int i = 2;i <= number / 2; i++) {
            if((number % i)==0){
                return  false;
            }
        }
        return true;
    }

    public static float simpleMath(float num1, float num2, String operator){
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Error("wrong operation | choose from +, -, *, /");
        };
    }

    public static double circularArea(double radius){
        return Math.PI * radius * radius;
    }

    public static String decToBin(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }

    public static boolean checkPerfect(long number){
        long sum = 0;
        int index = 1;
        while(index <= number/2){
            if(number % index == 0){
                sum += index;
            }
            index++;
        }
        return sum == number;
    }
}
