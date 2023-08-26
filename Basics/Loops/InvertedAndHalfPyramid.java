public class InvertedAndHalfPyramid {

    public static void InvertedAndHalfPyramidStar(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void InvertedAndHalfPyramidNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print((k++) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void FloydTriangle(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print((k++) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void ZeroAndOnes(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = (k==0) ? 1 : 0;
            int toggle = k;

            for (int j = 1; j <= i; j++) {
                toggle = (toggle==0) ? 1 : 0 ;
                System.out.print( toggle );
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {

        // InvertedAndHalfPyramidNumbers(5);
        // FloydTriangle(5);
        ZeroAndOnes(5);
    }
}
