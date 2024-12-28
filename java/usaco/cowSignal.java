import java.io.*;

//2:00 pm 12/28/2024
//left at 2:55 pm

public class cowSignal{
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("cowsignal.out");

        String[] MNK =  br.readLine().split(" ");
        int originalHeight = Integer.parseInt(MNK[0]);
        int originalWidth = Integer.parseInt(MNK[1]);
        int K = Integer.parseInt(MNK[2]);
        String currentPrintingRow;

        String[][] originalSignal = new String[originalHeight][originalWidth];
        String[][] amplifiedSignal = new String[K * originalHeight][K * originalWidth];

        for(int i =0; i< originalHeight; i++){ //reads original signal
            String[] signalRow = br.readLine().split("(?!^)");
            for(int a =0; a < originalWidth; a++){
                originalSignal[i][a] = signalRow[a];
            }
        }

        for(int row =0; row < originalSignal.length; row++){
            int originalCharacter = 0;
            for(int currentCharacter =0; currentCharacter < originalWidth; currentCharacter+=K){
                for(int amplifiedCharacter=0; amplifiedCharacter < K; amplifiedCharacter++){
                    amplifiedSignal[row][amplifiedCharacter + currentCharacter] = originalSignal[row][currentCharacter];
                }
                originalCharacter++;
            }
        }

        for(int currentRow = 0; currentRow < K * originalSignal.length; currentRow+=K){
            for(int amplifiedRow =0; amplifiedRow < amplifiedSignal.length; amplifiedRow++){
                amplifiedSignal[currentRow + amplifiedRow] = amplifiedSignal[currentRow];
            }
        }

        // for(int i =0; i< originalSignal.length; i++ ){ //iterates over each row
        //     int originalCharacter = 0;
        //     for(int a =0; a < originalWidth*K; a+=K){ //iterates over each original character
        //         for(int N =0; N < K; N++){
        //             amplifiedSignal[i][a+N] = originalSignal[i][originalCharacter];
        //         }
        //         originalCharacter++;
        //     }
        //     for(int N = 0; N < K; N++){ //vertical stretch
        //         amplifiedSignal[i + N] = amplifiedSignal[i];
        //     }
        // }

        // for(int i =0; i< originalHeight; i++){ //prints original signal
        //     currentRow="";
        //     for(int a =0; a< originalWidth; a++){
        //         currentRow+= originalSignal[i][a];
        //     }
        //     System.out.println(currentRow);
        // }
        
        for(int i =0; i< K* originalHeight; i++){ //prints amplified signal
            currentPrintingRow="";
            for(int a =0; a< K*originalWidth; a++){
                currentPrintingRow+= amplifiedSignal[i][a];
            }
            System.out.println(currentPrintingRow);
        }
    }
}