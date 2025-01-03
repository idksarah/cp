import java.io.*;
import java.util.*;

//2:06 pm 1/1/2025 !!!
//fml 3:05
public class bucketList {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("blist.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("blist.out");
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());

        int[][] everything = new int[N][3];
        int freeBuckets=0, numOfBuckets=0, startCount=0, endCount=0, bucketCount=0;

        for(int i = 0; i < N; i++){
            String[] temp = br.readLine().split(" ");
            everything[i][0] = Integer.parseInt(temp[0]);
            everything[i][1] = Integer.parseInt(temp[1]);
            everything[i][2] = Integer.parseInt(temp[2]);
        }

        // System.out.println(Arrays.toString(starts));
        // System.out.println(Arrays.toString(ends));
        // System.out.println(Arrays.toString(buckets));

        // int[] timeline = new int[ends[N-1]];
        // for(int i =0; i < ends[N-1]; i++){
        //     timeline[i] = i+1;
        // }

        // System.out.println(Arrays.toString(timeline));

        
        System.out.println(Arrays.toString(buckets));

        for(int a =1; a < ends[N-1]+1; a ++){
            System.out.println("time:" + a);
            if(startCount != N && a == starts[startCount]){
                // System.out.println("start" + starts[startCount]);
                if(buckets[bucketCount] < freeBuckets){
                    // System.out.println("less buckets required than free");
                    freeBuckets-= buckets[bucketCount];
                    bucketCount++;
                } else {
                    // System.out.println("more buckets required than free");
                    // System.out.println("buckets immediately needed" + buckets[bucketCount]);
                    numOfBuckets += (buckets[bucketCount] - freeBuckets);
                    freeBuckets=0;
                    bucketCount++;
                }
                // System.out.println("buckets needed" + numOfBuckets);
                // System.out.println("bucket count" + bucketCount);
                // System.out.println("start count" + startCount);
                // System.out.println("free buckets" + freeBuckets);
                startCount++;
            }else if(endCount != N && a == ends[endCount]){
                freeBuckets += buckets[endCount];
                // System.out.println("free bucket count" + freeBuckets);
                endCount++;
            }
        }

        System.out.println(numOfBuckets);
        
    }
}
