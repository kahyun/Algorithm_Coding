

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[][]A = new int[n][m];
        int[][]B = new int[n][m];
        
        for(int i =0; i<n; i++) {
        	String[] arr = br.readLine().split(" ");
        	for( int j = 0; j<m; j++) {
        		A[i][j] = Integer.parseInt(arr[j]);
        	}
        }
        for(int i =0; i<n; i++) {
        	String[] arr = br.readLine().split(" ");
        	for( int j = 0; j<m; j++) {
        		B[i][j] = Integer.parseInt(arr[j]);
        	}
        }
        	for(int i = 0; i<n; i++ ) {
        		for( int j =0; j<m; j++) {
        			bw.write((A[i][j]+B[i][j])+ " ");
        		}
        		bw.newLine();
        	}
        	
        		
        bw.flush();
        bw.close();
        br.close();
        
        }

    }




	

