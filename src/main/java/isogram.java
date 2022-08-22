import java.util.HashMap;
import java.util.Map;

public class isogram {
    public static boolean  isIsogram(String str) {

        Map<Character,Integer> mapOfLetter = new HashMap<>();

        for (char ch :str.toLowerCase().toCharArray()) {
            Integer value = mapOfLetter.get(ch);
            if(value != null){
                mapOfLetter.put(ch, value+1);
            } else {
                mapOfLetter.put(ch, 1);
            }
        }
        for (Integer value: mapOfLetter.values()) {
            if(value > 1){
                return false;
            }
        }
        return true;
    } 
}