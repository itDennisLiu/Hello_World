import java.util.regex.Pattern;

public class TestNumeric {

    public static void main(String[] args) {

        if (isNumeric("12123 ")) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static boolean isNumeric (String str) {

        Pattern pattern = Pattern.compile("^-?[0-9]+");
        if(pattern.matcher(str).matches()) {
            //数字
            return true;
        } else {
            //非数字
            return false;
        }
    }


}
