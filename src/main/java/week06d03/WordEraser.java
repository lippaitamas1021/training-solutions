package week06d03;

public class WordEraser {

   public String eraseWord(String words, String word) {

       String[] arrWords = words.split(" ");

       StringBuilder builder = new StringBuilder();

       for (int i = 0; i < arrWords.length; i++) {
           if (!arrWords[i].equals(word)) {
               builder.append(arrWords[i] + " ");
           }
           }
       return builder.toString().trim();
       }
}
