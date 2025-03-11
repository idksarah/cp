import java.io.*;
import java.util.*;

public class airCownditoningII {
    public static void main(String[] args) throws IOException {
        /*
         * find the minimum sum of ac cost to reduce the temp of every section by the necessary amount

        1. find overlapping sections, determine desired temp. math.min()
        2. iterate over all possible combinations of ac units. 2^10 ? put them on a numberline idk. overlapping sections take the lowest temp. 
         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[] stalls = new int[20];
        Arrays.fill(stalls, Integer.MAX_VALUE);

        // finds desired temp for every stall
        for(int a = 0; a < N; a++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int temp = Integer.parseInt(st.nextToken());
            for(int b = start - 1; b < end; b++){
                stalls[b] = Math.min(temp, stalls[b]);
            }
        }

        // store ac values
        int[][] acs = new int[M][4];
        for(int a = 0; a < M; a++){
            st = new StringTokenizer(br.readLine());
            acs[a][0] = Integer.parseInt(st.nextToken());
            acs[a][1] = Integer.parseInt(st.nextToken());
            acs[a][2] = Integer.parseInt(st.nextToken());
            acs[a][3] = Integer.parseInt(st.nextToken());
        }
        
        // // check each ac
        // for(int a = 0; a < M; a++){
        //     // 1
        //     for(int b = 0; b < M; b++){
        //         // 2
        //         for(int c = 0; c < M; c++){
        //             // 3
        //             for(int d = 0; d < M; d++){
        //                 // 4
        //                 for(int e = 0; e < M; e++){
        //                     // 5
        //                     for(int f = 0; f < M; f++){
        //                         // 6
        //                         for(int g = 0; g < M; g++){
        //                             // 7
        //                             for(int h = 0; h < M; h++){
        //                                 // 8
        //                                 for(int i = 0; i < M; i++){
        //                                     // 9
        //                                     for(int j = 0; j < M; j++){
        //                                         // 10
        //                                     }
        //                                 }
        //                             }
        //                         }
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        
        
    }
}
