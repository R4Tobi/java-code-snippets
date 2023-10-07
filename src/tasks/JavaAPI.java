package tasks;

import java.util.Calendar;

public class JavaAPI {
    public static String time(){
        Calendar now = Calendar.getInstance();
        return now.getTime().toString();
    }

    public static double[] solveQuadraticEquation(double a, double b, double c){
        if(a == 0.0){
            throw new ArithmeticException("Die Gleichung ist nicht quadratisch.");
        }

        double[] x = new double[2];
        double notSmallerNull = Math.pow(b, 2) - 4*a*c;
        if(notSmallerNull < 0){
            throw new ArithmeticException("Die Gleichung kann nicht gelöst werden.");
        }
        x[0] = (-b + Math.sqrt(notSmallerNull))/(2.0*a);
        x[1] = (-b - Math.sqrt(notSmallerNull))/(2.0*a);

        return x;
    }

    public static String removeSpace(String str){
        return str.replaceAll(" ", "");
    }

    public static int removeFirstE(String str){
        return str.indexOf('e');
    }

    public static String[] splitString(String str){
        return str.split(" ");
    }
}
