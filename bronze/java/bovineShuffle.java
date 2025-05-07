import java.io.*;
import java.util.Arrays;

public class bovineShuffle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("shuffle.out");

        int N = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int[] shuffle = new int[N];
        int[] currentCowPos = new int[N], earlierCowPos = new int[N];

        for(int i =0; i < N; i++){
            shuffle[i] = Integer.parseInt(temp[i]);
        }

        temp = br.readLine().split(" ");
        for(int i =0; i < N; i++){
            currentCowPos[i] = Integer.parseInt(temp[i]);
        }

        int currentPos, earlierPos;
        Integer[] shufflePos = Arrays.stream(shuffle).boxed().toArray(Integer[]::new);

        for(int a =0; a < 3; a ++){ //3 swaps
            for(int b =0; b < N; b++){ //each cow
                earlierPos = Arrays.asList(shufflePos).indexOf(b+1);
                earlierCowPos[earlierPos] = currentCowPos[b];
            }
            currentCowPos = Arrays.copyOf(earlierCowPos, N);
        }

        for(int i =0; i < N; i ++){
            pw.println(earlierCowPos[i]);
        }
        pw.close();

    }
}
