import java.io.*;
import java.util.*;

public class cowGymnastics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("gymnastics.out");

        String[] KN = br.readLine().split(" ");
        int numOfSessions = Integer.parseInt(KN[0]);
        int numOfCows = Integer.parseInt(KN[1]);
        int[][] cows = new int[numOfSessions][numOfCows];

        for(int currSession =0; currSession < numOfSessions; currSession++){
            String[] stringCows = br.readLine().split(" ");
            for(int currCow = 0; currCow < numOfCows; currCow ++){
                cows[currSession][currCow] = Integer.parseInt(stringCows[currCow]);
            }
        }

        ArrayList<Integer> cowPairs = new ArrayList<Integer>();
        boolean currCowAIsBetter, expectedCowAIsBetter, consistentAcrossRows = true; 

        for(int cowA =1; cowA< numOfCows; cowA++){
            for(int cowB =1; cowB < numOfCows+1; cowB++){
                if(cowA == cowB){
                } else {
                    int expectedAPos = 0, expectedBPos = 0;
                    while(cows[0][expectedAPos] != cowA ){
                        expectedAPos++;
                    }
                    while(cows[0][expectedBPos] != cowB){
                        expectedBPos++;
                    }
    
                    if(expectedAPos < expectedBPos){
                        expectedCowAIsBetter = true;
                    } else {
                        expectedCowAIsBetter = false;
                    }

                    for(int currSession =1; currSession < numOfSessions; currSession++){ //checks each session
                        consistentAcrossRows = true;
                        int currAPos =0, currBPos = 0;
                        while(cows[currSession][currAPos] != cowA){
                            currAPos++;
                        }
                        while(cows[currSession][currBPos] != cowB){
                            currBPos++;
                        } 
                        
                        if(currAPos < currBPos){
                            currCowAIsBetter = true;
                        } else {
                            currCowAIsBetter = false;
                        }
    
                        if(currCowAIsBetter != expectedCowAIsBetter){
                            consistentAcrossRows = false;
                            break;
                        }
                    }
                    if(consistentAcrossRows){
                        cowPairs.add(cowA);
                        cowPairs.add(cowB);
                    }
                }
                
            }
        }

        Set<List<Integer>> uniquePairs = new HashSet<>(); //idk how this works
        for(int i =0; i < cowPairs.size(); i+=2){
            int cowA = cowPairs.get(i);
            int cowB = cowPairs.get(i+1);

            List<Integer> pair = Arrays.asList(Math.min(cowA, cowB), Math.max(cowA, cowB));
            uniquePairs.add(pair);
        }
        pw.println(uniquePairs.size());
        pw.close();
    }
}