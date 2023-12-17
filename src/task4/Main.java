package task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            List<Integer> list = new ArrayList<>();
            String c;
            while ((c = br.readLine()) != null) {
                list.add(Integer.parseInt(c));
            }
            func(list);
        }
    }
    private static void func(List<Integer> list){
        int sum = 0;
        for (int i : list){
            sum += i;
        }
        int medium = Math.round((float) sum / list.size());
        int num = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (Math.abs(list.get(i) - medium) < Math.abs(num - medium))
                num = list.get(i);
        }
        int result = 0;
        for (int i : list){
            result += Math.abs(i - num);
        }
        System.out.println(result);
    }
}
