import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

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

        int count = 0;
        for(int a =0; a < M-2; a ++){
            for(int b = a + 1; b < M; b++){
                for(int c = b + 1; c < M; c ++){
                    HashSet<String> spottyThrees = new HashSet<>();
                    HashSet<String> normalThrees = new HashSet<>();
                    for(int z = 0; z < N; z ++){
                        spottyThrees.add(spotty[z][a]+""+spotty[z][b]+""+spotty[z][c]);
                        normalThrees.add(normal[z][a]+""+normal[z][b]+""+normal[z][c]);
                    }
                    spottyThrees.retainAll(normalThrees);
                    if(spottyThrees.isEmpty()){
                        count++;
                    }
                }
            }
        }
        pw.println(count);
        pw.close();
    }
}
