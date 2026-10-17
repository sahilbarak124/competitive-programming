import java.util.*; 
public class ClearIthBit {
    public static int clearithbit(int n ,int i){
        int BitMask=~(1<<i);
        return n & BitMask; 
    }
    public static void main(String args[]){
        System.out.println(clearithbit(10, 1));
    }

    
}
