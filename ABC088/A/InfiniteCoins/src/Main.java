import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var N = scanner.nextInt();
            var A = scanner.nextInt();

            var remainder = N % 500;

            if (remainder <= A) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
