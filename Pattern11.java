public class Pattern11 {
    public static void main(String[] args) {
        int i, j;
        int c = 5;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c--;
        }
    }

}
