import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (var scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            String[] numbers = new String[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.next();
            }

            int matchWithPreNum = 0;
            String pre = "";
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    pre = numbers[i];
                    continue;
                }

                if (numbers[i].equals(pre)) {
                    matchWithPreNum++;

                    if (matchWithPreNum == 2) {
                        System.out.print("Yes");
                        return;
                    }
                } else {
                    pre = numbers[i];
                    matchWithPreNum = 0;
                }
            }

            System.out.print("No");
        }
    }
}
