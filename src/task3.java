import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter matrix dimension n (not more than 20): ");
        int n = in.nextInt();
        in.nextLine();

        int[][] a = new int[n][n];
        System.out.println("Enter the matrix by rows, separated by space:");

        for (int i = 0; i < n; i++) {
            System.out.print("Row " + i + ": ");
            String line = in.nextLine();
            String[] parts = line.split(" ");

            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(parts[j]);
            }
        }

        System.out.println("Entered matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // логічний вектор Y
        boolean[] Y = new boolean[n];

        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i][j] == a[i][k]) {
                        unique = false;
                    }
                }
            }
            Y[i] = unique;
        }

        System.out.println("Logical vector Y:");
        for (int i = 0; i < n; i++) {
            System.out.println("Y[" + i + "] = " + Y[i]);
        }
    }
}