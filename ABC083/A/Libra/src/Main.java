import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();
            var c = scanner.nextInt();
            var d = scanner.nextInt();

            if (a + b > c + d) {
                System.out.println("Left");
            } else if (a + b == c + d) {
                System.out.println("Balanced");
            } else {
                System.out.println("Right");
            }
        }
    }
}
