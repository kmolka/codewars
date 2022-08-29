public class XO {
  
  public static boolean getXO (String str) {
    String word = str.toLowerCase();
    char[] tableOfChar = new char[word.length()];
    int amountOfX = 0;
    int amountOfO = 0;
    for(int i = 0;i < word.length(); i++){
      if(word.charAt(i) == 'x'){
        amountOfX += 1;
      }
    }
    for(int i = 0;i < word.length(); i++){
      if(word.charAt(i) == 'o'){
        amountOfO += 1;
      }
    }

    if(amountOfO == amountOfX){
      return true;
    }else{
      return false;
    }
  }
}