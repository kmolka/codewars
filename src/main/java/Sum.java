public class Sum {

    public int GetSum(int a, int b) {
        int suma = 0;
        if (a == b) {
            return a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                suma = suma + i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                suma = suma + i;
            }
        }
        return suma;
    }
}