import java.io.*;
import java.util.*;

public class shellGame{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int swaps = Integer.parseInt(br.readLine());
        System.out.println(swaps);

        int swapCounter = 0;
        int[] shells = new int[swaps * 3];
        for(int i =0; i<swaps*3; i=i+3){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            shells[i]=Integer.parseInt(st.nextToken());
            shells[i+1]=Integer.parseInt(st.nextToken());
            shells[i+2]=Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(shells));
    }
}