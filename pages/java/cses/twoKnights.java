import java.io.*;
import java.util.*;

public class twoKnights {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());

        for(long temp=1; temp<size+1;temp++){
            long ans = ((temp * temp * (temp * temp -1))/2) - (4*(temp -2)*(temp-1));

            System.out.println(ans);
        }
    }
}