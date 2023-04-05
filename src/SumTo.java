// import the scanner here
import java.util.Scanner;
public class SumTo {
    public static void main(String[] args) {
        // create the scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter a number to sum to
        System.out.println("What number to sum to? ");
        // save the user answer as answer and read as an integer
        int answer = reader.nextInt();
        int i=1;
        int sumTotal = 0;
        while (i <= answer){ // modify this part so that you can sum all numbers
            System.out.print(i + " ");
            sumTotal = sumTotal + i;
            i++;
            //System.out.println("Sum total growing... " + sumTotal);
        }
        System.out.println("\nSum total is " + sumTotal);
    }
}
