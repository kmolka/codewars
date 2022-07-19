public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;

    for (char letter:str.toCharArray()) {
      if(letter=='a' || letter =='e' || letter == 'i' || letter == 'o' || letter == 'u'){
        vowelsCount += 1;
      }
    }
    return vowelsCount;
  }
}