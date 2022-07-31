class GetTheMiddleCharacter {
  public static String getMiddle(String word) {
    String result;
    if(word.length()%2 != 0){
      int indexOfMiddleCharacter = word.length()/2;
      Character middleCharacter = word.charAt(indexOfMiddleCharacter);
      result = String.valueOf(middleCharacter);
    } else {
      int indexOfMiddleCharacter1 = word.length()/2-1;
      int indexOfMiddleCharacter2 = word.length()/2;
      Character middleCharacter1 = word.charAt(indexOfMiddleCharacter1);
      Character middleCharacter2 = word.charAt(indexOfMiddleCharacter2);
      result = String.valueOf(middleCharacter1) + String.valueOf(middleCharacter2);

    }
    return result;
  }
}