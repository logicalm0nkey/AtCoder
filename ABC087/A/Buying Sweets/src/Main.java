import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var x = scanner.nextInt();
            var a = scanner.nextInt();
            var b = scanner.nextInt();

            var result = x - a;
            while (true) {
                if (result - b < 0) {
                    break;
                }

                result -= b;
            }

            System.out.println(result);
        }
    }
}
