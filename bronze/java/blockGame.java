import java.io.*;
import java.util.Scanner;

public class blockGame{
    public static void main(String[] args) throws IOException {            
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] overallCount = new int[26];

        for(int i =0; i< N; i++){ 
            int[] tempCountFront = new int[26];
            int[] tempCountBack = new int[26];
            String front = sc.next();
            String back = sc.next();
            for(int a=0; a<front.length(); a++){
                tempCountFront[front.charAt(a) -'a']++; //get current character, convert to int, use as index for tempCountFront, and increment value
            }
            for(int a=0; a<back.length(); a++){ 
                tempCountBack[back.charAt(a) -'a']++;
            }            
            for(int c =0; c< 26; c++){ //for each letter
                overallCount[c] += Math.max(tempCountFront[c], tempCountBack[c]);
            }
        }
        for(int i=0; i<26;i++){
            System.out.println(overallCount[i]);
        }
        sc.close();
    }
}