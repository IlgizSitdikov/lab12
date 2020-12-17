package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumber {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[0-9]+[ ]*[+]");
        Matcher matcher = pattern.matcher("(1 + 8) – 9 / 4");

        if (matcher.find()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        Matcher matcherWrong = pattern.matcher("6 / 5 – 2 * 9");
        if (matcherWrong.find()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

