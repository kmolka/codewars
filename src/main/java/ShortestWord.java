public class ShortestWord {
    public static int findShort(String s) {
        String[] arrayOfStr = s.split("\\s");
        int min = arrayOfStr[0].length();
        for (String word: arrayOfStr) {
            if(word.length() < min){
                min = word.length();
            }

        }
       return min;
    }
}