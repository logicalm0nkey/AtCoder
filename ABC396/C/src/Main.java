import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (var scanner = new Scanner(System.in)) {
            // 白黒総数
            String[] bwCount = scanner.nextLine().split(" ");
            int n = Integer.parseInt(bwCount[0]);
            int m = Integer.parseInt(bwCount[1]);

            // 黒玉の価値
            String[] bs = scanner.nextLine().split(" ");
            List<Integer> bValues = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                bValues.add(Integer.parseInt(bs[i]));
            }
            // 黒玉の価値を降順ソート（入力順は関係無いため）
            Collections.sort(bValues, (a, b) -> -a.compareTo(b));

            // 白玉の価値
            String[] ws = scanner.nextLine().split(" ");
            List<Integer> wValues = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                wValues.add(Integer.parseInt(ws[i]));
            }
            // 白玉の価値を降順ソート（入力順は関係無いため）
            Collections.sort(wValues, (a, b) -> -a.compareTo(b));

            long sum = 0;
            // 黒玉を足した個数
            int bSumCount = 0;
            int wSumCount = 0;

            for (int i = 0; i < n; i++) {
                // 正の黒玉を全部乗せ
                if (bValues.get(i) > 0) {
                    sum += bValues.get(i);
                    bSumCount++;
                }
            }

            for (int j = 0; j < m; j++) {
                // 正の白玉を、正の黒玉以下の個数で全部足し
                if (wValues.get(j) > 0 && wSumCount <= bSumCount - 1) {
                    sum += wValues.get(j);
                    wSumCount++;
                }
            }

            // 黒玉の+は摂りつくしてるので、黒玉のうち価値はマイナスだけど、白玉と足したらプラスになるものを探して合計に加算する
            // 黒玉のインデックスを固定
            // 黒玉は全部ループしないでいい（for 分は不要）
            // 降順に並んでいることから、このインデックスで合計が増えなかったら、それ以降のインデックスで増えるはずがないので、処理を打ち切る
            int i = bSumCount;
            // 白玉を動かす
            for (int j = wSumCount; j < m && i < n; j++) {
                // マイナスの黒玉と足して合計が増えるのは、白玉がプラスのときに限る（白玉もマイナスなら絶対増えないので）
                // よって、プラスの白玉だけに限定して計算する
                if (wValues.get(j) > 0) {
                    if (sum + bValues.get(i) + wValues.get(j) > sum) {
                        sum = sum + bValues.get(i) + wValues.get(j);
                        // 次の黒玉の検証に移る
                        i++;
                    }
                } else {
                    // 白玉も降順なので、マイナスの値が出てきたら処理を打ち切る
                    break;
                }
            }

            System.out.println(sum);
        }
    }
}
