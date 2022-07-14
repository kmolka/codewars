public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallestInteger = args[0];
        for(int i = 0; i < args.length; i++){
            if(smallestInteger > args[i]){
                smallestInteger = args[i];
            }
        }
        return smallestInteger;
    }
}