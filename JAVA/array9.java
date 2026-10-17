import java.util.*;
public class array9 {
    public static void kadane(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currsum+=numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        kadane(numbers);
    }
}
