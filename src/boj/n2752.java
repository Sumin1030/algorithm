package boj;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class n2752{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        String[] arrStr = br.readLine().split(" ");
        for(int i = 0; i < arrStr.length; i++)
        	arr[i] = Integer.parseInt(arrStr[i]);
        
        int min = 0, max = 0;
        for(int i = 1; i < arr.length; i++){
           if(arr[min] > arr[i])
               min = i;
            if(arr[max] < arr[i])
                max = i;
        }
        
        System.out.printf("%d %d %d", arr[min], arr[3-min-max], arr[max]);
        
    }
}
