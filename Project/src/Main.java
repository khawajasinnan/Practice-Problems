import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var player1 = new Player("C:\\Users\\KHS\\Desktop\\Project\\src\\Data1.txt");
        var player2 = new Player("C:\\Users\\KHS\\Desktop\\Project\\src\\Data2.txt");

        System.out.println("Player 1 details:");
        player1.printDetails();
        System.out.println();

        System.out.println("Player 2 details:");
        player2.printDetails();
        System.out.println();

        System.out.println("Comparing players:");
        player1.compareAndPrintBetter(player2);

        System.out.println("New player:");
        Player player3 = new Player();
        Scanner scanner = new Scanner(System.in);
        player3.input(scanner);
        System.out.println("New player details:");
        player3.printDetails();
    }
}