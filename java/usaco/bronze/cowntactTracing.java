
import java.io.*;

// 6:52 pm 2/16
// 4:45 pm 2/18

public class cowntactTracing {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("tracing.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("tracing.out");

        /*
        -if a sick cow appears AGAIN in the log, and the cow they shake hands with IS NOT SICK, limit K to the time between the initial shake and this shake

        first time a sick cow apears in the log:
            if the cow they shake hands with is sick:
                they could be patient zero
            if the cow they shake hands with IS NOT sick:
                they are not patient zero
                skip

        int x = 0
        int y = 0
        String z = infinity

        hashmap<> cows
        int[][] log = new int[numOfInteractins][3]
        log.sort()

        # sick cow input
        for int a < numOfCows:
            if nextToken == 1:
                hashmap.add(a, 1) # (cowNum, cowSickOrNot)
            else:
                hashmap.add(a,0)

        # log input
        for int a < numOfInteractions:
            log[a] = br.readline.split(" ")
        
        for int a < cows
            if cows.get(a) == 1: # if it's a sick cow
                int firstInteraction = -1
                boolean patientZero = false
                hashset<> sickShook = <>
                for int b < numOfInteractions
                    int left = log[b][1]
                    int right = log[b][2]
                    if patientZero:
                        if sickcows.contains left:
                            y 
                        else:
                            z = math.max(b - firstInteraction)

                    else:

                        if sickcows.contains left:
                            if firstInteraction == -1:
                                if sickcows.contains right:
                                    for int c < b:
                                        if sickCows.contains(log[c][0]) || sickCows.contains(log[c][1]):
                                            not patient zero
                                        else:
                                            patientZero = true
                                            firstInteraction = b
                                            sickShook.add(b)
                                else:
                                    not patient zero
                        else:
                            if sickcows.contains right:


        -
        boolean firstAppearance
         */
    }
}
