
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] Z = new boolean[31];	
        
        for(int i =0; i<28; i++) {
        		int N = Integer.parseInt(br.readLine());
        		Z[N] = true;
        	}
        	for(int i = 1; i<=30; i++ ) {
        		if(!Z[i]) {
        		System.out.println(i);	
        		}
        		
        	}
        	
        		
        bw.flush();
        bw.close();
        br.close();
        
        }

    }




	

