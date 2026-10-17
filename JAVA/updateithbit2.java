import java.util.*;
public class updateithbit2{
     public static int clearithbit(int n ,int i){
        int BitMask=~(1<<i);
        return n & BitMask; 
    }
    public static int setithbit(int n, int i) {
        int BitMask=1<<i;
        return n|BitMask;
    }
    
   
    public static int update(int n,int i,int newbit){
        n=clearithbit(n,i);
        int Bitmask=newbit<<i;
        return n|Bitmask;
      
    }
    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
    
}
