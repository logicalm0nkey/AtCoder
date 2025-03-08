import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var s = scanner.next();

            System.out.println(s.replaceFirst("2017", "2018"));
        }
    }
}
