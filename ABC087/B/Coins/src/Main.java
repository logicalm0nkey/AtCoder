import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            // 500円玉の数
            var a = scanner.nextInt();
            // 100円玉の数
            var b = scanner.nextInt();
            // 50円玉の数
            var c = scanner.nextInt();
            // 合計額（50の倍数）
            var x = scanner.nextInt();

            var pattern = 0;

            for (var i = 0; i <= a; i++) {
                // 500円玉だけでの金額
                var multipleOf500 = 500 * i;

                if (multipleOf500 == x) {
                    pattern++;
                    continue;
                }

                if (multipleOf500 > x) {
                    // 500円玉0枚からパターンを数えているので、
                    // 500円玉だけで x を超えたら、もう x 円になるパターンは無くなる。
                    // ので、処理終了。
                    break;
                }

                for (var j = 0; j <= b; j++) {
                    var multipleOf100 = 100 * j;

                    if (multipleOf500 + multipleOf100 == x) {
                        pattern++;
                        continue;
                    }

                    if (multipleOf500 + multipleOf100 > x) {
                        break;
                    }

                    for (var k = 0; k <= c; k++) {
                        var multipleOf50 = 50 * k;

                        if (multipleOf500 + multipleOf100 + multipleOf50 == x) {
                            pattern++;
                        }

                        if (multipleOf500 + multipleOf100 + multipleOf50 > x) {
                            break;
                        }
                    }
                }
            }

            System.out.println(pattern);
        }
    }
}
