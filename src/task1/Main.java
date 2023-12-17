package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length > 1) {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            int num = 1;
            boolean flag = true;
            List<Integer> list = new ArrayList<>();
            while (flag) {
                list.add(num);
                for (int i = 1; i < m; i++) {
                    if (num == n)
                        num = 1;
                    else
                        num++;
                }
                if (num == 1)
                    flag = false;
            }
            for (int i : list)
                System.out.print(i);
        }
    }
}
