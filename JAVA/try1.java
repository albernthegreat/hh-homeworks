import java.util.Scanner;
public class try1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        do {
            System.out.print("Enter a word (or 'quit' to exit): ");
            userInput = scanner.nextLine();
            System.out.println("You entered: " + userInput);
        } while (!userInput.equalsIgnoreCase("quit"));
        
        System.out.println("Goodbye!");
    }

}
