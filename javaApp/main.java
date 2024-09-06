public class main {
    public static String reverseWord(String userWord) {
        if(userWord.isEmpty()) {
            return userWord;
        } else {
            return reverseWord(userWord.substring(1) + userWord.charAt(0));
        }
    }


        public static void main(String[] args){
        String answer = reverseWord("Hello");

        System.out.println(answer);
        }


}
