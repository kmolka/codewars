public class Codewars {
  public static String oddOrEven (int[] array) {
    int suma = 0;
    String result;
    for(int i =0; i < array.length; i++){
      suma = suma + array[i];
    }
    if(suma % 2 == 0){
      result = "even";
    } else {
      result = "odd";
    }
  return result;
  }
}