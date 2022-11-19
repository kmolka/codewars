public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        //example PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
        String result = "(";
        for(int i=0; i < 3; i++){
            result = result + String.valueOf(numbers[i]);
        }
        result = result + ") ";

        for (int i = 3; i < 6;i++){
            result = result + String.valueOf(numbers[i]);
        }
        result = result + "-";

        for (int i = 6; i < numbers.length;i++){
            result = result + String.valueOf(numbers[i]);
        }
        return result;
    }
}
