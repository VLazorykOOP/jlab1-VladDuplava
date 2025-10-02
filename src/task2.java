import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array A: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter number of elements in array B: ");
        int m = scanner.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int[] union = new int[n + m];
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (!contains(union, size, A[i])) {
                union[size] = A[i];
                size++;
            }
        }

        for (int i = 0; i < m; i++) {
            if (!contains(union, size, B[i])) {
                union[size] = B[i];
                size++;
            }
        }

        int sum = 0;
        System.out.println("Elements of union A ∪ B:");
        for (int i = 0; i < size; i++) {
            System.out.print(union[i] + " ");
            sum += union[i];
        }

        System.out.println("\nSum of union elements: " + sum);
    }

    // Функція, яка перевіряє чи є вже елемент у масиві
    public static boolean contains(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}