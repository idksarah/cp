package codeForces;

import java.io.*;
import java.util.*;

// 6:20pm 2/25
public class _2067a {
    public static int sum(int inputA) {
        int sum = 0;
        while(inputA > 0){
            sum = sum + inputA % 10;
            inputA = inputA / 10;
        }
        return(sum);
    }
    public static void main(String[] args) throws IOException{   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test_cases = Integer.parseInt(st.nextToken());
        for(int a =0; a < test_cases; a++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            boolean yay = false;

            int min = Math.min(x, y);
            int max = Math.max(x, y);
            int currB = (max);
            
             for (int b = 0; b < max; b++){
                int currA = min;
                for(int c = 0; c < min; c++){
                    if(sum(currA) == sum(currB+1)){
                        yay = true;
                    }
                    currA++;
                }
                currB++;
             }
             
            if(yay){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
