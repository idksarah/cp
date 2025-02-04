import java.io.*;
import java.util.*;

// 5:32 pm 2/3/25

public class sleepingInClass {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int a = 0; a < T; a ++){ //each case
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();
            for(int b = 0; b < N; b++){
                nums.add(Integer.parseInt(st.nextToken()));
            }
            int sum = nums.stream().mapToInt(Integer::intValue).sum();

            ArrayList<Integer> sumFactors = new ArrayList<>();
            for(int b = 1; b <= sum; b++){
                if(sum % b == 0){
                    sumFactors.add(b);
                }
            }
            System.out.println(sum);
            System.out.println(sumFactors);
            int count = Integer.MAX_VALUE;
        //     for(int b = 0; b < sumFactors.size(); b++){
        //         int tempCount = 0;
        //         for(Integer factor : sumFactors){
        //             List<Integer> newNums = new ArrayList<>(nums);
        //             int d = 0;
        //             for(int c = 0; c < nums.size(); c ++){
        //                 while(newNums.get(d) < b){
        //                     System.out.println("d"+d);
        //                     System.out.println("num" + newNums.get(d));
        //                     if(newNums.get(d) > b){
        //                         break;
        //                     } else {
        //                         newNums.set(d, newNums.get(d) + newNums.get(d+1));
        //                         newNums.remove(d+1);
        //                         System.out.println(newNums);
        //                         if(nums.get(d) <= b){
        //                             tempCount++;
        //                             System.out.println(tempCount);
        //                         }
        //                     }
        //                 }
        //                 System.out.println("d++");
        //                 d++;
        //             }
        //         count = Math.min(count, tempCount);
        //     }
        //     // System.out.println(count);
        // }
    }
}
}