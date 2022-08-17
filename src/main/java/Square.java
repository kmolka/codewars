public class Square {    
    public static boolean isSquare(int n) {
        double result = Math.sqrt(n);
        int result1 = (int)result;
        double result2 = (double) result1;
        if(result == result2){
            return true;
        } else {
            return false;
        }
    }
}