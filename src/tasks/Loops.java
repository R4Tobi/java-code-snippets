package tasks;

import java.util.Arrays;

public class Loops {
    public static void loopTypes(){
        int index;
        for(index = 0; index < 10; index++){
            System.out.println("Hallo Fin (for-Schleife) " + index);
        }

        index = 0;
        while(index < 10){
            System.out.println("Hallo Fin (While-Schleife) " + index);
            index++;
        }

        index = 0;
        do{
            System.out.println("Hallo Fin (Do-While-Schleife) " + index);
            index++;
        }while(index < 10);


    }

    public static void count(int to){
        int index;
        for(index = 1; index < to*2; index++){
            if(index <= to) {
                System.out.print(" " + index);
            }else{
                System.out.print(" " + (to*2 - index));
            }
        }
        System.out.println();
    }

    public static void arrayCount(int start){
        int[] output = new int[2];
        output[1] = start;

        int index;
        for(index = 0; index <= start; index++){
            output[0] = index;
            output[1] = start - index;
            System.out.println(Arrays.toString(output));
        }
    }

    public static void sum(int until){
        int sum = 0;
        int index = 0;
        for(index = 0; index <= until; index++){
            sum += index;
        }
        System.out.println("Sum of all integers from 0 to " + until + ": " + sum);
    }

    public static void sawTooth(int length, int iterations){
        int index;
        for(index = 0; index < iterations; index++){
            String stern = "*";
            int x = 0;
            do{
                x++;
                System.out.println(stern);
                stern += "*";
            }while(x < length);
        }
    }
}
