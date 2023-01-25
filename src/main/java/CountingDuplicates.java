import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

  //    "abcde" -> 0 # no characters repeats more than once
//    "aabbcde" -> 2 # 'a' and 'b'
//    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//    "indivisibility" -> 1 # 'i' occurs six times
//    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//    "aA11" -> 2 # 'a' and '1'
//    "ABBA" -> 2 # 'A' and 'B' each occur twice


  public static int duplicateCount(String text) {

    Map<Character,Integer> mapOfChar = new HashMap<>();
    int lengthOfString = text.length();
    text = text.toLowerCase();
    int suma = 0;

    for(int i = 0; i < lengthOfString;i++){
      if(mapOfChar.containsKey(text.charAt(i))){
        mapOfChar.put(text.charAt(i),mapOfChar.get(text.charAt(i))+1);
      } else {
        mapOfChar.put(text.charAt(i),1);
      }
    }

    for ( char e : mapOfChar.keySet()) {
      if(mapOfChar.get(e) > 1){
        suma = suma + 1;
      }
    }
    return suma;
  }
}