import java.io.*;
import java.util.*;

public class missingNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());

        int input = Integer.parseInt(st.nextToken());

        Integer[] actualNumbers = new Integer[input-1];
        String rawActualNumbers = r.readLine(); 
        StringTokenizer rawSt = new StringTokenizer(rawActualNumbers, " ");

        for(int i =0; i<actualNumbers.length; i++){
            actualNumbers[i] = Integer.valueOf(Integer.parseInt(rawSt.nextToken()));
        }

        Arrays.sort(actualNumbers, Collections.reverseOrder()); 
        for(int i =0; i<actualNumbers.length; i++){
            if((input -i) != actualNumbers[i]){
                System.out.println(input -i);
                System.exit(0);
            }
        }
        System.out.println(input-1);
        }
    }
    