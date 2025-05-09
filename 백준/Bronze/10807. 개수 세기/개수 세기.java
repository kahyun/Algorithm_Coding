

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
        	int N = Integer.parseInt(br.readLine());
        	String[] output = br.readLine().split(" ");
        	int num = Integer.parseInt(br.readLine());
        	
        	int count = 0;
        	for(int j =0; j<N; j++) {
        			int V = Integer.parseInt(output[j]);
        			if(num == V)
        			count++;
        		}
        		
        			System.out.println(count);
        	
       
        bw.flush();
        bw.close();
        br.close();
        
        }

    }




	

