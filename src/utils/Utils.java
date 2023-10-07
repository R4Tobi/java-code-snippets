package utils;

public class Utils {
    public static String[] push(String[] array, String push) {
        String[] longer = new String[array.length + 1];
        System.arraycopy(array, 0, longer, 0, array.length);
        longer[array.length] = push;
        return longer;
    }

    public static boolean[] push(boolean[] array, boolean push) {
        boolean[] longer = new boolean[array.length + 1];
        System.arraycopy(array, 0, longer, 0, array.length);
        longer[array.length] = push;
        return longer;
    }

    public static boolean contains(boolean[] array, boolean value) {
        for (boolean b : array) {
            if (value == b) {
                return true;
            }
        }
        return false;
    }

    public static int randomNumber(){
        return (int)((Math.random() - 0.5)*200);
    }

    public static void reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Tauschen Sie die Elemente an den äußeren Enden
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Bewegen Sie die Zeiger nach innen
            left++;
            right--;
        }
    }
}
