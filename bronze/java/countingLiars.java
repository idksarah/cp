import java.io.*;

public class countingLiars{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[2 * N];
        int min=1001, tempMin=0;

        for(int i=0; i < 2 *N; i+=2){
            String[] temp = br.readLine().split(" ");
            inputs[i] = temp[0].charAt(0); //reading ascii value
            //71 = G
            //76 = L
            inputs[i+1] = Integer.parseInt(temp[1]);
        }

        for(int i =0; i < inputs.length; i+=2){
            if(inputs[i] ==71){ //if G
                for(int a =0; a < inputs.length; a+=2){
                    if((a!=i) && ((inputs[a] == 76) && (inputs[a+1] < inputs[i+1])) || ((inputs[a] == 71 && inputs[a+1] > inputs[i + 1]))){
                        tempMin++;
                    }
                }
            } else { //if L
                for(int a =0; a < inputs.length; a+=2){
                    if((a!=i) && ((inputs[a] == 71) && ((inputs[a+1] > inputs[i+1])) || (inputs[a] == 76 && (inputs[a+1] < inputs[i+1])))){
                        tempMin++;
                    }
                }
            }
            
            if(tempMin < min){
                min = tempMin;
            }
            tempMin=0;
        }
        System.out.println(min);
    }
}