package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2941 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int count = 0;
        
        for(int i = 0; i < word.length(); i++){
            if(i<word.length()-1 && (word.charAt(i+1) == '=' || word.charAt(i+1) == '-'))
                i++;
            else if(i < word.length()-2 && word.substring(i,i+3).equals("dz="))
                i+=2;
            else if(i<word.length()-1 && word.charAt(i) == 'l' || word.charAt(i) == 'n' && word.charAt(i+1) == 'j')
                i++;
            
            count++;
        }
        
        System.out.println(count);
    }
}
