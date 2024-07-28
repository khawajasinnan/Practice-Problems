import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    public static void readData(String filename, Player obj) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(";");

            if (scanner.hasNext()) {
                obj.setTeamName(scanner.next().trim());
            }
            if (scanner.hasNext()) {
                obj.setPlayerName(scanner.next().trim());
            }
            if (scanner.hasNext()) {
                obj.setNoOfInnings(Integer.parseInt(scanner.next().trim()));
            }
            if (scanner.hasNext()) {
                obj.setNoOfNotOuts(Integer.parseInt(scanner.next().trim()));
            }
            if (scanner.hasNext()) {
                String[] scoreStrings = scanner.next().trim().split("\\s+");
                int[] scores = new int[100];
                for (int i = 0; i < scoreStrings.length && i < obj.getNoOfInnings(); i++) {
                    scores[i] = Integer.parseInt(scoreStrings[i]);
                }
                obj.setScoreList(scores);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number in file: " + filename);
        }
    }
}