import java.io.*;
import java.util.*;

//6:00 pm 1/3/25
//passes sample case 6:09
//6:15

public class distinctNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        HashSet<Integer> nums = new HashSet<>();

        for(int i =0; i < N; i++){
            nums.add(Integer.parseInt(temp[i]));
        }
        System.out.println(nums.size());
    }
}