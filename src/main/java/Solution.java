import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

  public static boolean validatePin(String pin) {
    Pattern pattern = Pattern.compile("\\d{4}");
    Matcher matcher = pattern.matcher(pin);
    boolean matchPIN = matcher.find();
    Pattern pattern2 = Pattern.compile("\\d{6}");
    Matcher matcher2 = pattern2.matcher(pin);
    boolean matchPIN2 = matcher2.find();
    if((pin.length() == 4 && matchPIN == true)){
      return true;
    }
    if((pin.length() == 6 && matchPIN2 == true)){
      return true;
    } else {
      return false;
    }
  }
}