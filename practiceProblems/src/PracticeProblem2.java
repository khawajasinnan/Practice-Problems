

public class PracticeProblem2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 6, 4, 3, 10, 15};
        int greater = arr[0];
        int smaller = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greater) {
                greater = arr[i];
            }
            else if (arr[i] < smaller) {
                smaller = arr[i];
            }

            System.out.println("Greater numbers are: " + greater);
            System.out.println("Smaller numbers are: " + smaller);
        }
    }
}