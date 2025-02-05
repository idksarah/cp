import java.io.*;
import java.util.*;

// 5:32 pm 2/3/25
// 8:31 pm
// 9:09 sample
// passes 10/11 idc

public class sleepingInClass {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int a = 0; a < T; a ++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();
            for(int b = 0; b < N; b++){
                nums.add(Integer.parseInt(st.nextToken()));
            }
            int sum = nums.stream().mapToInt(Integer::intValue).sum();
            if(sum == 0 ){
                System.out.println(0);
            } else {
                HashSet<Integer> sumFactors = new HashSet<>();
                for(int b = 1; b <= sum/2; b++){
                    if(sum % b == 0){
                        sumFactors.add(b);
                        sumFactors.add(sum/b);
                    }
                }
                int count = Integer.MAX_VALUE;
                for(Integer factor: sumFactors){
                    int currDiff = factor;
                    int tempCount = 0;
                    for(int b = 0; b < nums.size(); b++){
                        if(!nums.get(b).equals(factor)){
                            currDiff -= nums.get(b);
                            if(currDiff < 0){
                                break;
                            } else if(currDiff == 0 ){
                                currDiff = factor;
                                tempCount--;
                            }
                            tempCount++;
                        }
                    }
                    if(currDiff > 0 ){
                        count = Math.min(count, tempCount);
                    }
                }
                System.out.println(count);
                
            }
        }
    }
}