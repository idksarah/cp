import java.io.*;
import java.util.HashSet;

public class whereAmI {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter("whereami.out");

        int N = Integer.parseInt(br.readLine());
        String farms = br.readLine();
        int min = 1;
        
        for(int a = 1; a < N; a++){
            boolean unique = true;
            int tempMin = 1;
            HashSet<String> farmSequence = new HashSet<String>();

            System.out.println(farmSequence);

            for(int b = 0; b < farms.length() - a + 1; b++){
                String currSequence = farms.substring(b, b + a);
                int size = farmSequence.size();
                farmSequence.add(currSequence);
                if(size == farmSequence.size()){
                    unique = false;
                }
            }
            if(unique){
                pw.println(a);
                pw.close();
                break;
            }
        }
    }
}