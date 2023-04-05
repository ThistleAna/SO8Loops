// import the Scanner class
import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // do print, ask the user to enter a number to display the times table
        System.out.println("Enter a Number");
        // save the user answer as variable answer
        int answer = sc.nextInt();

        // use for loop to print timestable answer*1 to answer*12
        for(int i=1; i<13; i++){
            System.out.println(i + "x" + answer + ": " + answer * i); // display answer x 1 =
        }
    }
}
