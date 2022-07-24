import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troll {
    public static String disemvowel(String str) {

        List<String> vowels = List.of("a", "o", "i", "e", "u", "A", "O", "I", "E", "U");
        String replaceString = str;

        for (String vowel: vowels) {
            replaceString = replaceString.replace(vowel, "");
        }
        return replaceString;
    }
}