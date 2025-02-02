import java.io.*;

//1:47 pm 12/29/24
//break 2:26
//back at 4:44 lol
//left at 5 
// back at 6:10
// passes sample cases 6:12
//giving up 6:21 lol
//FUCK IM BACK 6:25
//fuuuuuuuuuuuck
//giving up at 7:26
//back at 12:27 pm
//12: 36 holy fuck

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