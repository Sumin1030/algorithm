package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2480 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numStr = br.readLine().split(" ");
        int[] num = new int[numStr.length];
        for(int i = 0; i<numStr.length; i++)
            num[i] = Integer.parseInt(numStr[i]);
        
        int count = 0;
        int max = num[0];
        int countNum = 0;
        int[] nums = new int[6];
        for(int i = 0; i < num.length; i++){
            if(nums[num[i]-1] != 0){
                count = nums[num[i]-1]+1;   
                countNum = num[i];
            }
            nums[num[i]-1]++;
            if(max < num[i])
                max = num[i];
        }
        
        if(count == 0)
            System.out.println(max*100);
        else if(count == 2)
            System.out.println(1000+countNum*100);
        else
            System.out.println(10000+countNum*1000);
        
    }
}
