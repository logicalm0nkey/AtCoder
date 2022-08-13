import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var bits = scanner.next().toCharArray();
            var cntOf1 = 0;

            for (var number : bits) {
                cntOf1 += number == '1' ? 1 : 0;
            }

            System.out.println(cntOf1);
        }
    }
}
