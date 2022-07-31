import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String newNum = String.valueOf(num);
    char[] tableOfDigits = newNum.toCharArray();
    Integer[] newTable = new Integer[tableOfDigits.length];

    for(int i=0; i < tableOfDigits.length; i++){

      int numericValue = Character.getNumericValue(tableOfDigits[i]);
      newTable[i] = numericValue;
    }

    Arrays.sort(newTable, Collections.reverseOrder());
    String newString = "";

    for(int i = 0; i < newTable.length; i++){
      newString = newString + String.valueOf(newTable[i]);

    }

    Integer newNumber = Integer.valueOf(newString);

    return newNumber;
  }
}