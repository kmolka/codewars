import java.util.ArrayList;
import java.util.List;

public class Kata2 {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    List<Object> newList = new ArrayList<>();
    for (Object element: list) {
      if(element instanceof Integer){
        newList.add(element);
      }
      
    }
    return newList;
  }
}