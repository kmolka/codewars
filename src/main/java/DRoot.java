public class DRoot {
  public static int digital_root(int n) {
    // example
    // 16  -->  1 + 6 = 7
    // 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6

    String string = String.valueOf(n);
    while(string.length() > 1){
      int suma = 0;
      char[] chars = string.toCharArray();
      for(int i = 0; i < chars.length; i++){
        suma = suma + Character.getNumericValue(chars[i]);
      }
      string = String.valueOf(suma) ;
    }
    return Integer.parseInt(string);
  }
}