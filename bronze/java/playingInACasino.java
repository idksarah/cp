import java.io.*;
import java.util.*;

// 10:00 4/24/25
// example case 8:34 4/25/25 //guess we gotta sort...
// i get the math now!! 4:31 4/27

public class playingInACasino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i =0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[][] c = new int[b][a];
            for(int j = 0; j < a; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < b; k++){
                    c[k][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j = 0; j < b; j++){
                Arrays.sort(c[j]);
                // System.out.println(Arrays.toString(c[j]));
            }
            testCase(a, b, c);
        }
    }

    public static void testCase (int attributes, int cards, int[][] num){
        long sum = 0;
        for(int i = 0; i < cards; i++){
            long presum = num[i][0];
            for(int j = 1; j < attributes; j++){
                sum += 1L * j * num[i][j] - presum;
                presum += num[i][j];
            }
        }
        System.out.println(sum);
    }
}