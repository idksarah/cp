
import java.io.*;
import java.util.*;

// 11:15 am 1/25/2025
// 12:16 pm

public class itsMooinTime {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] longs = new long[N];
        String[] rawLongs = br.readLine().split(" ");
        for(int i =0; i < N; i++){
            longs[i] = Long.parseLong(rawLongs[i]);
        }
        Set<String> moos = new HashSet<>();

        for(int a =0; a < (N-2); a ++){
            for(int b = 1; b< N; b++){
                for(int c =b + 1; c < N-1; c++){
                    if(a + c < N){
                        String first = Long.toString(longs[a]);
                        String second = Long.toString(longs[a+b]);
                        String third = Long.toString(longs[a+c]);
                        // System.out.println(possMoo);
                        if((second.equals(third)) && 
                        !(first.equals(second))){
                            String possMoo = first + second + third;
                            moos.add(possMoo);
                        }
                    }
                }
            }
        }

        // for (String moo : moos) {
        //     System.out.println("accepted moo" + moo);
        // }
        System.out.println(moos.size());
    }
}
