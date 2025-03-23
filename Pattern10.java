public class Pattern10 {
    public static void main(String[] args) {
        int i, j;
        int c = 5;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= 6 - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
