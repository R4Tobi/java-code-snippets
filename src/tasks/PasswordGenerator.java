package tasks;

public class PasswordGenerator {

    public static void newPass(int length, boolean Buchstaben, boolean Zahlen, boolean Sonderzeichen){
        String CharSet = "";
        if(Buchstaben){
            String buchstabenStr = "QWERTZUIOPASDFGHJKLYXCVBNMqwertzuiopasdfghjklyxcvbnm";
            CharSet += buchstabenStr;
        }
        if(Zahlen) {
            String zahlenStr = "1234567890";
            CharSet += zahlenStr;
        }
        if(Sonderzeichen){
            String sonderzeichenStr = "^!\"§$%&/()=?{[]}<>,;.:-_µ€@#'+*~";
            CharSet += sonderzeichenStr;
        }
        if(!Buchstaben && !Sonderzeichen && !Zahlen){
            throw new IllegalArgumentException("At least 1 boolean must be true");
        }
        String[] set = CharSet.split("");
        StringBuilder password = new StringBuilder();
        for(int index = 0; index < length; index++){
            password.append(set[(int) (Math.random() * set.length)]);
        }

        System.out.printf(new String(password));
    }
}
