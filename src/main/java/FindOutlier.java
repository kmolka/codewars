import java.util.ArrayList;

public class FindOutlier{
  static int find(int[] integers){
    //example [2, 4, 0, 100, 4, 11, 2602, 36]
    //Should return: 11 (the only odd number)

    int result = 0;
    ArrayList<Integer> odd = new ArrayList();
    ArrayList<Integer> even = new ArrayList<>();
    for(int i = 0; i < integers.length; i++){
      if(integers[i]%2 == 0){
        even.add(integers[i]);
      } else {
        odd.add(integers[i]);
      }
    }
    if(even.size() == 1){
      result = even.get(0);
    } else if(odd.size() == 1){
      result = odd.get(0);
    }
    return result;
  }
}