import java.util.*;
public class bitmanipulation {
    public static void oddoreven(int n){
        int Bitmask=1;
        if((n&Bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
       
        oddoreven(3);
        oddoreven(4);
        oddoreven(5);
    }
    
}
