import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PracticeProblem1 {
    public static void main(String[] args) {

        //Practice Problem 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String string = scanner.nextLine();
        System.out.println("Length of String: " + string.length());
        System.out.println("String in uppercase: " + string.toUpperCase());
        for(int i = 0; i < string.length(); i++) {
            System.out.println("Each character of the string: " + string.charAt(i));
        }
    }
}