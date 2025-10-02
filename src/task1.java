import java.util.Scanner;

public class task1 {

    public static double calculate(double x, double y) {
        return (2 * Math.pow(x, 2) + x * y) / Math.pow(x * y, 2)
                + (3 * x * y - Math.pow(y, 3)) / (Math.pow(x, 2) + 2 * Math.pow(y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculation: (2x² + xy)/(xy)² + (3xy – y³)/(x² + 2y²)");

        System.out.print("Input x: ");
        double x = sc.nextDouble();

        System.out.print("Input y: ");
        double y = sc.nextDouble();

        double result1 = calculate(x, y);
        System.out.println("Option 1 (double→double): " + result1);

        double result2 = calculate((int) x, (int) y);
        System.out.println("Option 2 (int→double): " + result2);

        int result3 = (int) Math.round(calculate(x, y));
        System.out.println("Option 3 (double→int): " + result3);

        sc.close();
    }
}