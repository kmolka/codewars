public class Accumul {


    public static String accum(String s) {
     // example accum("abcd") -> "A-Bb-Ccc-Dddd"


        String newString = "";

        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){

                String multiplyChar = Character.toString(chars[i]).repeat(i+1);
                multiplyChar = upperCaseFirstLetterInString(multiplyChar);
                newString = newString + multiplyChar + "-";
        }

        return newString.substring(0, newString.length()-1);

    }

    public static String upperCaseFirstLetterInString(String str){
        String string = str.toLowerCase();
        String s1 = string.substring(0, 1).toUpperCase();
        String s2 = string.substring(1);
        return s1 + s2;
    }
}