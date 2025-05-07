import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class daisyChains {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] flowers = new int[N];
        int averageFlower = 0;
        st = new StringTokenizer(br.readLine());
        for(int a = 0; a < N; a++){
            flowers[a] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i ++){
            int sum = 0;
            int divisor = 0;
            for(int j = i; j < N; j++){
                sum += flowers[j];
                divisor++;
                if(sum % divisor == 0){ // checking if it's an int
                    int average = sum / divisor;
                    for(int k = i; k <= j; k++){
                        if(flowers[k] == average){
                                averageFlower++;
                                average = 0; //break the loop
                            
                            }
                        }
                    }
                }
            }
            System.out.println(averageFlower);
        }
    }
