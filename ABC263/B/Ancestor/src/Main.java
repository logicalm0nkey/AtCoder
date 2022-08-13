import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 2 <= N <= 50
        var N = scanner.nextInt();
        var P = new int[N + 1];

        for (var i = 2; i <= N; i++) {
            P[i] = scanner.nextInt();
        }

        int parent = N;
        int ancestor = 0;

        while (parent != 1) {
            parent = P[parent];
            ancestor++;
        }

        System.out.println(ancestor);
    }
}
