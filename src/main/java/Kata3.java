import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata3 {
  public static String reverseWords(final String original) {
    Pattern pattern = Pattern.compile("^\\s{1,}$");
    Matcher matcher = pattern.matcher(original);
    if(matcher.find()){
      return original;
    }else{
      String[] listOfWords = original.split("\\s");
      ArrayList<String> newList = new ArrayList<>();
      for (String element: listOfWords) {
        newList.add(reverse(element));
      }
      return String.join(" ", newList);
    }
  }

  private static String reverse(String original) {
    char[] ch = original.toCharArray();
    String result = "";
    for(int i = ch.length-1; i >= 0; i--){
      result = result + ch[i];

    }
    return result;
  }
}