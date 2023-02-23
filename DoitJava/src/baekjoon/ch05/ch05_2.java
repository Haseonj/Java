package baekjoon.ch05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ch05_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] num = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            int n = d(i);
            if(n <= 10000){
                num[n] = true;
            }
        }

        for(int i = 1; i <= 10000; i++){
            if(!num[i]){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }

    }

    public static int d(int n){
        int sum = n;
        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

}
