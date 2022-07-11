public class Positive{

  public static int sum(int[] arr){
    int suma = 0;
    for (int item: arr) {
      if(item > 0){
        suma += item;
      }
    }
    return suma;
  }
}