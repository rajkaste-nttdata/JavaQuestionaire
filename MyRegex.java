import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    private static final String IPV4_PATTERN =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);

    public static boolean isValid(final String ip) {
        if (ip == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValid("000.12.12.034"));
        System.out.println(isValid("121.234.12.12"));
        System.out.println(isValid("23.45.12.56"));
        System.out.println(isValid("000.12.234.23.23"));
        System.out.println(isValid("666.666.23.23"));
        System.out.println(isValid(".213.123.23.32"));
        System.out.println(isValid("23.45.22.32."));
        System.out.println(isValid("I.Am.not.an.ip"));
    }
}
