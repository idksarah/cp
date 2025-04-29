import java.io.*;

//1:47 pm
//inputted till 2:16
//3:06 passes 1st test
//passed at 3:07

public class bovineGenomics {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
		PrintWriter pw = new PrintWriter("cownomics.out");

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int numOfGenomes = Integer.parseInt(NM[1]);

		char[][] spottyGenomes = new char[N][numOfGenomes];
		char[][] normalGenomes = new char[N][numOfGenomes]; 

		for (int a=0; a< N; a++){
            String temp = br.readLine();
			for(int b = 0; b < numOfGenomes; b++){
				spottyGenomes[a][b] = temp.charAt(b);
			}
		}

        for (int a=0; a< N; a++){
            String temp = br.readLine();
			for(int b = 0; b < numOfGenomes; b++){
				normalGenomes[a][b] = temp.charAt(b);
			}
		}

		int counter =0;

		for(int currGenome =0; currGenome < numOfGenomes; currGenome++){
			int spottedA =0, spottedG =0, spottedC =0, spottedT =0, normalA =0, normalG =0, normalC =0, normalT =0;
			for(int currSpotted = 0; currSpotted < N; currSpotted++){
				if(spottyGenomes[currSpotted][currGenome] == 'A'){
					spottedA++;
				} else if (spottyGenomes[currSpotted][currGenome] == 'G'){
					spottedG++;
				} else if(spottyGenomes[currSpotted][currGenome] == 'C'){
					spottedC++;
				} else {
					spottedT++;
				}
			}
			for(int currNormal = 0; currNormal < N; currNormal++){
				if(normalGenomes[currNormal][currGenome] == 'A'){
					normalA++;
				} else if (normalGenomes[currNormal][currGenome] == 'G'){
					normalG++;
				} else if(normalGenomes[currNormal][currGenome] == 'C'){
					normalC++;
				} else {
					normalT++;
				}
			}

			if(((spottedA != 0 && normalA == 0) || (spottedA ==0 && normalA !=0) || (spottedA ==0 && normalA == 0)) 
			&& ((spottedG != 0 && normalG == 0) || (spottedG ==0 && normalG !=0) || (spottedG ==0 && normalG == 0))
			&& ((spottedC != 0 && normalC == 0) || (spottedC ==0 && normalC !=0) || (spottedC ==0 && normalC == 0))
			&& ((spottedT != 0 && normalT == 0) || (spottedT ==0 && normalT !=0 || (spottedT ==0 && normalT == 0)))){
					counter++;
			}
		}
		pw.println(counter);
		pw.close(); 
    }
}