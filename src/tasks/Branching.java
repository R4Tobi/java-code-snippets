package tasks;

import utils.Utils;

import java.util.Arrays;

public class Branching {
    public static void checkEven(int number){
        if(number % 2 == 0){
            System.out.println("Die Zahl " + number + " ist gerade");
        }else{
            System.out.println("Die Zahl " + number + " ist ungerade");
        }
    }

    public static void isInRange(int number, int[] range){
        if(number > range[0] && number < range[1]){
            System.out.println("Die Zahl " + number + " liegt im Intervall");
        }else{
            System.out.println("Die Zahl " + number + " liegt nicht im Intervall");
        }
    }

    public static void divisibleBy_OR(int number, int[] divisors){
        boolean[] booleanList = {};
        for(int index = 0; index < divisors.length; index++){
            booleanList = Utils.push(booleanList, number % divisors[index] == 0);
        }
        if(Utils.contains(booleanList, true)){
            System.out.println("Die Zahl kann durch einen der Teiler geteilt werden.");
        }else{
            System.out.println("Die Zahl kann nicht durch einen der Teiler geteilt werden.");
        }
    }

    public static void convertNote(int grade){
        switch(grade){
            case 1:{
                System.out.println("sehr gut");
                break;
            }
            case 2:{
                System.out.println("gut");
                break;
            }
            case 3:{
                System.out.println("befriedigend");
                break;
            }
            case 4:{
                System.out.println("ausreichend");
                break;
            }
            case 5: {
                System.out.println("mangelhaft");
                break;
            }
            case 6:{
                System.out.println("ungenügend");
                break;
            }
            default:{
                System.out.println("Keine Note.");
                break;
            }
        }
    }

    public static void sortThreeRandomNumbers(){
        int[] a = {Utils.randomNumber(),Utils.randomNumber(), Utils.randomNumber()};
        System.out.println("Die Zahlen " + java.util.Arrays.toString(a) + " werden nach ihrer Größe sortiert.");
        java.util.Arrays.sort(a);
        System.out.println("Sortiert: " + Arrays.toString(a));
    }
}
