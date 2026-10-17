import java.util.*;
public class clearlastibits {
    public static int clearIBits(int n,int i){
        int Bitmask=(~0)<<i;
        return n & Bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearIBits(15,2));
    }
}
