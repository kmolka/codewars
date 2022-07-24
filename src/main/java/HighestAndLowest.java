public class HighestAndLowest {
  public static String highAndLow(String numbers) {
    String[] newNumbers = numbers.split("\\s");
    int highestValue = Integer.valueOf(newNumbers[0]);
    int lowestValue = Integer.valueOf(newNumbers[0]);;
    for(int i=0; i < newNumbers.length; i++){
      int numericValue = Integer.valueOf(newNumbers[i]);
      if(numericValue > highestValue){
        highestValue = numericValue;
      }
      if(numericValue < lowestValue){
        lowestValue = numericValue;
      }
    }
    String result = String.valueOf(highestValue) + " " + String.valueOf(lowestValue);
    return result;
  }
}