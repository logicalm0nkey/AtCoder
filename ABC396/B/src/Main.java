import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        try (var scanner = new Scanner(System.in)) {
            // 0山積み
            Stack<Integer> zeros = new Stack<>();
            for (int i = 0; i < 100; i++) {
                zeros.push(0);
            }

            int queryCount = Integer.parseInt(scanner.nextLine());
            List<Integer> pops = new ArrayList<>();

            for (int i = 0; i < queryCount; i++) {
                String query = scanner.nextLine();
                String[] order = query.split(" ");
                if (order[0].equals("1")) {
                    zeros.push(Integer.parseInt(order[1]));
                } else {
                    pops.add(zeros.pop());
                }
            }
            
            for (Integer i : pops) {
                System.out.println(i);
            }
        }
    }
}
