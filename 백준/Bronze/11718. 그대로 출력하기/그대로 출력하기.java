import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while ((line = br.readLine()) != null) { // EOF가 올 때까지 반복
            System.out.println(line);
        }
        
        br.close();
    }
}
