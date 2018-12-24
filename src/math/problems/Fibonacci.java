package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int [] fibo = new int[40];
        for (int i = 0; i < 40; i++) {
            if(i<2) {
                fibo[i] = i;
            }else{
                fibo[i] = fibo [i-2]+ fibo[i-1];
            }
        }
        System.out.println(Arrays.toString(fibo));
    }
}