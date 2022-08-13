import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var scanener = new Scanner(System.in);

        // input
        int[] array = new int[5];
        array[0] = scanener.nextInt();
        array[1] = scanener.nextInt();
        array[2] = scanener.nextInt();
        array[3] = scanener.nextInt();
        array[4] = scanener.nextInt();

        var list = new ArrayList<Integer>();

        for (int x : array) {
            for (int y : array) {
                if (x == y) {
                    list.add(y);
                }
            }

            if (list.size() == 1 || list.size() >= 4) {
                System.out.print("No");
                return;
            }

            list.clear();
        }

        System.out.print("Yes");
    }
}
