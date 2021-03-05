package boj;
import java.util.Scanner;

public class n1316 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] alphabet;
        int num = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i<num; i++){
            String word = sc.next();
            alphabet = new int[26];
            boolean flag = true;
            for(int j = 0; j<word.length(); j++){
                if(j==word.length()-1 || word.charAt(j) != word.charAt(j+1)){
                    if(alphabet[word.charAt(j)-'a'] != 0){
                        flag = false;
                        break;
                    }
                    alphabet[word.charAt(j)-'a']++;
                }
            }
            if(flag) {
            	count++;
            	System.out.println(word);
            }
        }
        sc.close();
        System.out.println(count);
    }
}
