import java.io.*;

public class cowSignal{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("cowsignal.out");

        String[] MNK =  br.readLine().split(" ");
        int originalHeight = Integer.parseInt(MNK[0]);
        int originalWidth = Integer.parseInt(MNK[1]);
        int K = Integer.parseInt(MNK[2]);
        String currentPrintingRow;

        String[][] originalSignal = new String[originalHeight][originalWidth];
        String[][] amplifiedSignal = new String[originalHeight][K * originalWidth];

        for(int i =0; i< originalHeight; i++){ //reads original signal
            String[] signalRow = br.readLine().split("(?!^)");
            for(int a =0; a < originalWidth; a++){
                originalSignal[i][a] = signalRow[a];
            }
        }

        for(int row=0; row< originalSignal.length; row++){
            int translate=0;
            for(int originalChar = 0; originalChar < originalSignal[row].length; originalChar++){
                for(int amplifiedChar = 0; amplifiedChar < K; amplifiedChar++){
                    amplifiedSignal[row][amplifiedChar+translate] = originalSignal[row][originalChar];
                }
                translate+=K;
            }
        }

        for(int i =0; i< amplifiedSignal.length; i++){ //prints amplified signal
            currentPrintingRow="";
            for(int a =0; a< K*originalWidth; a++){
                currentPrintingRow+= amplifiedSignal[i][a];
            }
            for(int a=0; a < K; a++){
                // System.out.println(currentPrintingRow);
                pw.println(currentPrintingRow);
            }
        }
        pw.close();
    }
}