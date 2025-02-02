import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

// 11:27 am
// sample case 12:25 pm
// passed 12:27 

public class bovineGenomics {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter("cownomics.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] spotty = new char[N][M];
        char[][] normal = new char[N][M];

        for(int a =0; a < N; a++){
            st = new StringTokenizer(br.readLine());
            String genomes = st.nextToken();
            for(int b =0; b < M; b++){
                spotty[a][b] = genomes.charAt(b);
            }
        }
        for(int a =0; a < N; a++){
            st = new StringTokenizer(br.readLine());
            String genomes = st.nextToken();
            for(int b =0; b < M; b++){
                normal[a][b] = genomes.charAt(b);
            }
        }
        // System.out.println(Arrays.deepToString(normal));

        int count = 0;
        for(int a =0; a < M-2; a ++){ // assumes that (i,j,k) = (j,i,k)
            for(int b = a + 1; b < M; b++){
                for(int c = b + 1; c < M; c ++){
                    HashSet<String> spottyThrees = new HashSet<>();
                    HashSet<String> normalThrees = new HashSet<>();
                    for(int z = 0; z < N; z ++){
                        spottyThrees.add(spotty[z][a]+""+spotty[z][b]+""+spotty[z][c]);
                        normalThrees.add(normal[z][a]+""+normal[z][b]+""+normal[z][c]);
                    }
                    System.out.println("spotty" + a + " " + spottyThrees);
                    System.out.println("normal" + a + " " + normalThrees);
                    spottyThrees.retainAll(normalThrees);
                    if(spottyThrees.isEmpty()){
                        count++;
                    }
                    System.out.println(count);
                }
            }
        }
        pw.println(count);
        pw.close();
    }
}
