import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class bitStrings {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        BigInteger mod = BigInteger.valueOf((long)(Math.pow(10,9)+7));

        BigInteger ans = BigInteger.valueOf(2).pow(n).mod(mod);

        System.out.println(ans);
    }
}