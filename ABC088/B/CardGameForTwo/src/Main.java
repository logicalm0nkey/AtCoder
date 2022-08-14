import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var N = scanner.nextInt();
            var array = new Integer[N];

            for (var i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array, Comparator.reverseOrder());

            var alice = 0;
            var bob = 0;
            var isAliceNow = true;

            for (var x : array) {
                if (isAliceNow) {
                    alice += x;
                } else {
                    bob += x;
                }
                isAliceNow = !isAliceNow;
            }

            System.out.println(alice - bob);
        }
    }
}
