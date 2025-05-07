import java.io.*;
import java.util.*;

public class guessTheAnimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("guess.in"));
        // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("guess.out");
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<String>[] traits = new HashSet[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken(); // ignore animal
            temp = st.nextToken(); // ignore number
            traits[i] = new HashSet<>();
            while(st.hasMoreTokens()){
                traits[i].add(st.nextToken());
            }
        }
        int max = 0;
        for(int a = 0; a < N; a++){
            ArrayList<String> curAnimalsTraits = new ArrayList<>(traits[a]);
            for(int b = 0; b < N; b++){
                int currCount = 0;
                if (b != a){
                    for(int c = 0; c < curAnimalsTraits.size(); c++){
                        if(traits[b].contains(curAnimalsTraits.get(c))){
                            currCount++;
                        }
                    }
                }
                max = Math.max(max, currCount);
            }
        }
        pw.println(max+1);
        pw.close();
    }
}
