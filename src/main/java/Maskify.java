public class Maskify {
    public static String maskify(String str) {
        int lengthOfString = str.length();
        String newStr = "";
        if(lengthOfString <= 4){
            return str;
        } else {
            char[] tableOfStr = str.toCharArray();
            for(int i=0; i < lengthOfString-4 ;i++){
                tableOfStr[i] = '#';
                newStr = newStr + tableOfStr[i];
            }
            newStr = newStr + str.substring(str.length()-4);
        }
        return newStr;
    }
}
