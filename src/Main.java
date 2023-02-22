import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        reverseString(word);

    }

    public static void reverseString(String word){
        String reversedWord = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }

        if(reversedWord.equals(word)){
            System.out.println("Palindromic");
        }else{
            System.out.println("Not Palindromic");
        }
    }
}
