public class Pattern15 {
    public static void main(String[] args) {
        int i, j;
        int c = 1;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }

}
