public class Patterntough {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern28(int n) {
        for (int row = 1; row <= (2 * n) - 1; row++) {
            int spaces = row <= n ? n - row : row - n;
            int total = row <= n ? row : (2 * n) - row;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= total; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int spaces = row < n ? n - row : row - n;
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            int c = row < n ? row : (2 * n) - row;
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int spaces = row < n ? n - row : row - n;
            for (int i = 0; i <= spaces; i++) {
                System.out.print("*");
            }
            int c = row < n ? row : (2 * n) - row;
            for (int col = c; col >= 1; col--) {
                System.out.print(" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= spaces; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int newn = 2 * n;
        for (int i = 0; i <= newn; i++) {
            for (int j = 0; j <= newn; j++) {
                int index = n - Math.min(Math.min(i, j), Math.min(newn - i, newn - j));
                System.out.print(index + " ");
            }
            System.out.println();
        }

    }
}
