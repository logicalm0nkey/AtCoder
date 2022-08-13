import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    private static long divideCount = 0;

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var N = scanner.nextInt();
            var aN = new long[N];

            for (var i = 0; i < aN.length; i++) {
                aN[i] = scanner.nextLong();
            }

            Predicate<Long> isEven = l -> l % 2 == 0;

            divideIfAllEven(aN, isEven);

            System.out.println(divideCount);
        }
    }

    private static void divideIfAllEven(long[] aN, Predicate<Long> isEven) {
        for (var an : aN) {
            if (!isEven.test(an)) {
                return;
            }
        }

        var ret = new long[aN.length];
        for (var i = 0; i < ret.length; i++) {
            ret[i] = aN[i] / 2;
        }

        divideCount++;
        divideIfAllEven(ret, isEven);
    }
}
