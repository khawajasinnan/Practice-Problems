import java.util.Scanner;

public class PracticeProblem3{
    public static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                System.out.println("The vowels are: "+ str.charAt(i));
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();
        int vowel = countVowels(input);
        System.out.print("Vowels: " + vowel);
    }



}