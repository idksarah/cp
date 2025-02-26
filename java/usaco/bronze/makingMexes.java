import java.io.*;
import java.util.*;

public class makingMexes {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int[] frequency = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int index = Integer.parseInt(st.nextToken());
            frequency[index] ++;
        }
        System.out.println(Arrays.toString(frequency));
        for(int num = 0; num < N; num++){
            System.out.println("num: " + num);
            int count = 0;
            int mex = Integer.MAX_VALUE;
            for(int missing = 0; missing < num; missing++){
                if (frequency[missing] == 0) {
                    mex = missing;
                }
            }
            
            System.out.println(mex);
        }
    }
}
/*
 * input
 * 
 * int count
 * frequency array containg values 0 to N
 * eg [0, 0, 3, 0]
 * for num in range(0,N):
 *      for index in frequency
    *   if frequency[index] != 0 and index + 1 == num:
    *     count += frequency[index]
    * print count

 * fo each index
 *  check if a num for that index == 0
 *      if so count = frquency
 * 
 */