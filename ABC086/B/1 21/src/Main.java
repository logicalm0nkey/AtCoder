import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var a = scanner.next();
            var b = scanner.next();

            var ab = Double.parseDouble(a + b);
            var abSqrt = Math.sqrt(ab);

            if (abSqrt == Math.floor(abSqrt)) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        }
    }
}
