public class Example1 {
    public static void main(String[] args) {
        // Loop: instruction to repeat statement  if the condition met

        for (int i=1; i <=5; i++ ) {
            System.out.println(i + ". Kick the enemy!");
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Hug the enemy!");
            j++; // to update the counter
        }

        // display number 10 to 1
        System.out.println("Print number 10 to 1 !");
        for (int y=10; y>=1; y--) {
            System.out.println(y);
        }
    }
}
