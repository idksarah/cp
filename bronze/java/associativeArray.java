import java.io.*;
import java.util.*;

public class associativeArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        HashMap<Long,Long> a = new HashMap<Long,Long>();
        for(int i=0;i < N; i++){
            st = new StringTokenizer(br.readLine());
            long t = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if(t==0){
                long v = Long.parseLong(st.nextToken());
                a.put(k,v);
            } else {
                if(a.get(k) == null){
                    System.out.println(0);
                } else {
                    System.out.println(a.get(k));
                }
            }
        }
    }
}