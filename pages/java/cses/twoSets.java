import java.io.*;
import java.util.*;

public class twoSets{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        if((N*(N+1)/2%2)==0){
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = i+1;
            }
            int[] set1,set2;
            int counter = 0;
            System.out.println(Arrays.toString(arr));
            if(N%2==0){ //even
                set1=new int[N/2];
                set2=new int[N/2];

                for(int i=0;i<N/2;i=i+2){
                    set1[i]=arr[i];
                    set1[i+1]=arr[N-1-i];
                    set2[i]=arr[i+1];
                    set2[i+1]=set1[i+1]-1;
                }
                System.out.println(Arrays.toString(set1));
                System.out.println(Arrays.toString(set2));
            } else { //odd
                set1=new int[(N/2)];
                set2=new int[(N+1)/2];
                
                while((counter * N - (counter-1)*(counter)/2 )< N*(N+1)/4){
                    set1[counter]=N-counter;
                    counter++;
                } 
                
                int whatev = counter-1;
                set1[whatev] = 1;
                System.out.println((counter));
                System.out.println(Arrays.toString(set1));
                System.out.println(set1[0] * counter - (set1[0]*(set1.length-1)/2 + set1[whatev]));
                while((set1[0] * counter - (set1[0]*(set1.length-1)/2 + set1[whatev])) != N*(N+1)/4){
                    System.out.println((whatev * N - (whatev-1)*(whatev)/2));
                    set1[whatev]=N-counter;
                    counter++;
                    System.out.println(counter);
                }
                //set1[whatev]=N-counter-1;
                //do set 2 here
            
            }
            System.out.println(Arrays.toString(set1));
            System.out.println(Arrays.toString(set2)); 
        } else {
            System.out.println("NO");
        }
        
    }
}