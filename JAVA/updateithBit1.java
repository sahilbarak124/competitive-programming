import java.util.*;
public class updateithBit1 {
     public static int clearithbit(int n ,int i){
        int BitMask=~(1<<i);
        return n & BitMask; 
    }
    public static int setithbit(int n, int i) {
        int BitMask=1<<i;
        return n|BitMask;
    }
    
   
    public static int update(int n,int i,int newbit){
        if(newbit==0){
            return clearithbit(n,i);
        }else{
            return setithbit(n,i);
        }
    }
    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}
