package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
            float[] center = new float[2];
            String[] str = br1.readLine().split(" ");
            for (int i = 0; i < 2; i++) {
                center[i] = Float.parseFloat(str[i]);
            }
            float radius = Float.parseFloat(br1.readLine());
            String str2;
            while ((str2 = br2.readLine()) != null) {
                float[] array = convert(str2);
                float result = (array[0] - center[0]) * (array[0] - center[0]) + (array[1] - center[1]) * (array[1] - center[1]);
                if (result == radius * radius) {
                    System.out.println("0 - точка лежит на окружности");
                } else if (result < radius * radius) {
                    System.out.println("1 - точка внутри");
                } else
                    System.out.println("2 - точка снаружи");
            }
        }
    }
    private static float[] convert(String str){
        String[] str2 = str.split(" ");
        float[] array = new float[2];
        for (int i = 0; i < 2; i++){
            array[i] = Float.parseFloat(str2[i]);
        }
        return array;
    }
}
