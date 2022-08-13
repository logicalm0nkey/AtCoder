import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 1 <= N <= M <= 10
        var N = scanner.nextInt();
        var M = scanner.nextInt();

        var array1 = new int[N];
        var array2 = new int[N];

        for (var i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        int columnCursor = N - 1;
        int value = N;
        boolean reset = false;

        while (columnCursor > 0) {
            value += 1;
            
            if (columnCursor == N - 1) {
                // 最大インデックスの時は M よりデカくなったら列をずらす
                if (value > M) {
                    columnCursor -= 1;
                    continue;
                }
            } else {
                // それ以外のインデックスは、1個上のインデックスの値になったらずらす
                if (value >= array1[columnCursor + 1]) {
                    columnCursor -= 1;
                    continue;
                }
            }

            // output
            array1[columnCursor] = value;
            for (var a : array1) {
                System.out.println(a + " ");
            }
        }
    }
}
