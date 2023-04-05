public class ThreeDigitsNumbers {
    public static void main(String[] args) {
        // create variable to store how many unique numbers
        int uCount =0;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                for(int k = 1; k <= 4; k++) {
                // Statements to eliminate duplicates
                    if (i != j && i!=k && j!=k){
                        System.out.println(i + " " + j + " " + k);
                        uCount++;
                    }
                }
            }
        }

        System.out.println("Total unique variations are :  " + uCount);

    }
}
