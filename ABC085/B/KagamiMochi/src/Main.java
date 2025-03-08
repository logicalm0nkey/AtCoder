import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var N = scanner.nextInt();
            var mochis = new Integer[N];
            for (var i = 0; i < N; i++) {
                mochis[i] = scanner.nextInt();
            }

            Arrays.sort(mochis, Comparator.reverseOrder());

            // 鏡餅の高さ
            var kagamiMochiHeight = 0;
            // 最大の直径 + 1
            var lastMochiDiameter = mochis[0] + 1;

            for (var mochi : mochis) {
                if (mochi < lastMochiDiameter) {
                    kagamiMochiHeight++;
                    lastMochiDiameter = mochi;
                }
            }

            System.out.println(kagamiMochiHeight);
        }
    }
}
