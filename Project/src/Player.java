import java.util.Scanner;

public class Player {
    private String teamName;
    private String playerName;
    private int noOfInnings;
    private int noOfNotOuts;
    private int[] scoreList;

    public Player() {
        teamName = "";
        playerName = "";
        noOfInnings = 0;
        noOfNotOuts = 0;
        scoreList = new int[100];
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNoOfInnings() {
        return noOfInnings;
    }
    public void setNoOfInnings(int noOfInnings) {
        this.noOfInnings = noOfInnings;
    }

    public int getNoOfNotOuts() {
        return noOfNotOuts;
    }
    public void setNoOfNotOuts(int noOfNotOuts) {
        this.noOfNotOuts = noOfNotOuts;
    }

    public int[] getScoreList() {
        return scoreList;
    }
    public void setScoreList(int[] scoreList) {
        this.scoreList = scoreList;
    }

    public double getAverageScore() {
        int totalScore = 0;
        for (int i = 0; i < noOfInnings; i++) {
            totalScore += scoreList[i];
        }
        return (double) totalScore / (noOfInnings - noOfNotOuts);
    }

    public Player(String filename) {
        FileHandling.readData(filename, this);
    }

    public void printDetails() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Name: " + playerName);
        System.out.println("Number of Innings: " + noOfInnings);
        System.out.printf("Average score: %.2f%n", getAverageScore());
    }

    public void input(Scanner scanner) {
        System.out.print("Enter Team Name: ");
        teamName = scanner.nextLine();
        System.out.print("Enter Player Name: ");
        playerName = scanner.nextLine();
        System.out.print("Enter Number of Innings: ");
        noOfInnings = scanner.nextInt();
        System.out.print("Enter Number of Not Outs: ");
        noOfNotOuts = scanner.nextInt();
        scoreList = new int[100];
        System.out.println("Enter scores (enter -1 to finish):");
        for (int i = 0; i < noOfInnings; i++) {
            int score = scanner.nextInt();
            if (score == -1) break;
            scoreList[i] = score;
        }
    }

    public void compareAndPrintBetter(Player other) {
        if (this.getAverageScore() > other.getAverageScore()) {
            this.printDetails();
        } else {
            other.printDetails();
        }
    }
}