
import java.io.*;
import java.util.*;

// 11:15 am 1/25/2025
// 12:16 pm
// 9:15 pm 1/27/25

public class itsMooinTime {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Long[] longs = new Long[N];
        String[] rawLongs = br.readLine().split(" ");
        for(int i =0; i < N; i++){
            longs[i] = Long.parseLong(rawLongs[i]);
        }
        HashMap<Long, Long> eunuchs = new HashMap<>(); // unique
        HashMap<Long, Long> dupes = new HashMap<>(); // value, place
        int counter = 0;

        for(int a =0; a < longs.length; a ++){
            if(!eunuchs.containsKey(longs[a])){
                if(!dupes.containsKey(longs[a])){
                    eunuchs.put(longs[a], (long)a);
                }
            } else {
                Long tempIndex = eunuchs.get(longs[a]);
                eunuchs.remove(longs[a]);
                dupes.put(longs[a], tempIndex);
            }
        } 
        for(Map.Entry<Long, Long> eunuch: eunuchs.entrySet()){
            for(Map.Entry<Long, Long> dupe: dupes.entrySet()){
                if(eunuch.getValue() < dupe.getValue()){
                    counter++;
                }
            }
        } 
        System.out.println(counter);
        // o(n^2) so. might be cooked
    }
}
