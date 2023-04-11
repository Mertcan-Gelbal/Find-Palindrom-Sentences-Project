import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        
        sentence = sentence.replaceAll("\\s+", ""); // Boşlukları kaldır
        
        if (findPalindrome(sentence)) {
            System.out.println(sentence + " a palindrome expression.");
        } else {
            System.out.println(sentence + " palindrome is not an expression.");
        }
    }

    public static boolean findPalindrome(String sentence) {
        
        MyStack<Character> stack = new MyStack<Character>();
        int length = sentence.length();

        // Add characters to stack
        for (int i = 0; i < length; i++) {
            char c = sentence.charAt(i);
            stack.push(c);
        }

        // Check by removing characters from stack
        for (int i = 0; i < length; i++) {
            char c = sentence.charAt(i);
            char topChar = stack.pop();
            if (c != topChar) {
                return false;
            }
        }
        return true;
    }
}
