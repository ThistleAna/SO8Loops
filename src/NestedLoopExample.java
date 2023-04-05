public class NestedLoopExample {
    public static void main(String[] args) {
        //Nested loop: a  loop inside another loop

        for (int i=1; i <= 9; i++){ // outer loop 1 and 2
            for (int j=0; j <= 9; j++){ // inner loop 1, 2 and 3
               if (j != i) {
                   System.out.println(i + " " + j);
               }
            }
        }
    }
}
// your turn, display 10, 11, 12, 13, 14....19...99
