

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	String[] input = br.readLine().split(" ");
        	int N = Integer.parseInt(input[0]);
        	int X = Integer.parseInt(input[1]);
        	
        	String[] output = br.readLine().split(" ");
        	
        	for(int j =0; j<N; j++) {
        		int num = Integer.parseInt(output[j]);
        		if(num<X) {
        			bw.write(num+" ");
        	}
        		
        }
    
        bw.flush();
        bw.close();
        br.close();
        }

    }




	

