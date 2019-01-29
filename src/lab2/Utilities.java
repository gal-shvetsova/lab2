package lab2;

public class Utilities {
    public static boolean isString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i)))
                return false;
        }
        return true;
    }
}
