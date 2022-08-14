import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            var a = scanner.nextInt();
            var b = scanner.nextInt();

            var sums = 0;

            // 自分の回答。文字列にして処理した…クソ。
            // for (var i = 1; i <= n; i++) {
            // var stringI = String.valueOf(i);
            // // 各桁の和
            // var digitSum = 0;

            // for (var l = 0; l < stringI.length(); l++) {
            // digitSum += Character.getNumericValue(stringI.charAt(l));
            // }

            // if (a <= digitSum && digitSum <= b) {
            // // 各桁の和が a 以上 b 以下なら、その整数を出力結果に加算
            // sums += i;
            // }
            // }

            // 整数を10で割った余りに注目
            for (var i = 1; i <= n; i++) {
                var digitSum = 0;
                // 10で割った商。最初は 10^0 で割ったとしてそのまま整数を代入。
                var dividedBy10 = i;

                while (dividedBy10 > 0) {
                    digitSum += dividedBy10 % 10;
                    dividedBy10 /= 10;
                }

                if (a <= digitSum && digitSum <= b) {
                    // 各桁の和が a 以上 b 以下なら、その整数を出力結果に加算
                    sums += i;
                }
            }

            System.out.println(sums);
        }
    }
}
