public class Main {
    public static void main(String[] args) {// loop that runs from 5 to 1 in descending order)
        for (int i = 5; i >= 1; i--) {// loop that runs from 1 to i
            for (int j = 1; j <= i; j++) {// Print a single asterisk without a newline character
                System.out.print("*");
            }// After the inner loop has finished, print a newline character to move to the next line
            System.out.println();
        }
    }
}
