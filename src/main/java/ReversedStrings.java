public class ReversedStrings {

  public static String solution(String str) {
    char ch;
    String newStr = "";
    for(int i=0; i <str.length(); i++){
      ch= str.charAt(str.length()-i-1);
      newStr = newStr + ch;
    }
    return newStr;
  }
}