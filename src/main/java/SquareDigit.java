public class SquareDigit {

  public int squareDigits(int n) {
    String newN = String.valueOf(n);
    char[] tableNewN = newN.toCharArray();
    String newString = "";
    for(int i=0; i < tableNewN.length; i++){
      int numericValue = Character.getNumericValue(tableNewN[i]);
      int r = numericValue *numericValue;
      newString += String.valueOf(r);
    }
    int result = Integer.valueOf(newString);
    return result;
  }

}