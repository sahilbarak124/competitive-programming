import java.util.*;
public class SetIthBit {
    public static int setithbit(int n, int i) {
        int BitMask=1<<i;
        return n|BitMask;
    }
    public static void main(String args[]){
        System.out.println(setithbit(10,2));
    }
}
