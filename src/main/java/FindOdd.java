import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer odd = null;

        for (int i = 0; i < a.length; i++) {
            Integer value = map.get(a[i]);
            if (value == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd = entry.getKey();
            }
        }
        return odd;
    }
}