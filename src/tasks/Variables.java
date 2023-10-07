package tasks;

public class Variables {
    public static void output(int number){
        System.out.println(number);
    }

    public static void square(int number){
        int b = (int) Math.pow(number, 2);
        System.out.println(number + "^2 = " + b);
    }

    public static void convertTemp(float fahrenheit){
        float Celsius = (float) (0.5556 *  (fahrenheit - 32));
        System.out.println(fahrenheit + "°F sind " + Celsius + "°C");
    }

    public static void convertTime(long millisecond){
        long hour;
        long minute;
        long second;

        hour = (millisecond / 3600000) % 24;
        minute = (millisecond % 3600000) / 60000;
        second = ((millisecond % 3600000) % 60000) / 1000;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
