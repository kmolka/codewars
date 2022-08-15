class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if(a >= b && a >= c && a < b + c){
      return true;
    }
    if(b >= a && b >= c && b < a + c){
      return true;
    }
    if(c >= b && c >= a && c < b + a){
      return true;
    } else {
      return false;
    }
  }
}