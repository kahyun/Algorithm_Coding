
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int j = Integer.parseInt(br.readLine());
        for(int i =0; i<j; i++) {
        	String[] input = br.readLine().split(" ");
        	int A = Integer.parseInt(input[0]);
        	int B = Integer.parseInt(input[1]);
        	bw.write((A+B)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
        }

    }




	

