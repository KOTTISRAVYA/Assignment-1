package assignment2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class vowels {

    public static void main(String[] args) throws IOException{
    	File Input=new File("C:\\Users\\Sravya\\Desktop\\ash");
    	File Output=new File("C:\\Users\\Sravya\\Desktop\\ash");
        FileReader br = new FileReader(Input);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inp[] = br.readLine().split(" ");
        for (int i = 0; i < inp.length; i++) {
            if (inp[i].length() > 1) {
                if (inp[i].charAt(1) == 'a' || inp[i].charAt(1) == 'e' || inp[i].charAt(1) == 'i' || inp[i].charAt(1) == 'o' || inp[i].charAt(1) == 'u')
                    System.out.print(inp[i]+" ");
            }
            //System.out.println(inp[i]);
        }
            
        bw.flush();
    }
}
