//1:00 pm 12/26/26

import java.io.*;
import java.util.Scanner;

public class blockGame{
    public static void main(String[] args) throws IOException {            
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] overallCount = new int[26];
        char[] abcs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i =0; i< N; i++){ //check each word pair
            int[] tempCountFront = new int[26];
            int[] tempCountBack = new int[26];
            String front = sc.next();
            String back = sc.next();
            for(int a=0; a<front.length(); a++){ //check each letter of front
                for(int b =0; b<26;b++){ //check each letter of abc
                    if(front.charAt(a) == abcs[b]){
                        tempCountFront[b]++;
                    }
                }
            }
            // System.out.println("front letters" + Arrays.toString(tempCountFront));
            for(int a=0; a<back.length(); a++){ //check each letter of back
                for(int b =0; b<26;b++){ //check each letter of abc
                    if(back.charAt(a) == abcs[b]){
                        tempCountBack[b]++;
                    }
                }
            }
            // System.out.println("back letters" + Arrays.toString(tempCountBack));
            
            for(int c =0; c< 26; c++){ //for each letter
                if(tempCountFront[c] > tempCountBack[c] || tempCountFront[c] == tempCountBack[c]){
                    overallCount[c] += tempCountFront[c];
                } else if(tempCountFront[c] < tempCountBack[c]){
                    overallCount[c] += tempCountBack[c];
                }
            }
            // System.out.println(Arrays.toString(overallCount));
        }
        for(int i=0; i<26;i++){
            System.out.println(overallCount[i]);
        }
        sc.close();
    }
}