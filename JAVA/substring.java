import java.util.*;
public class substring {
    public static void main(String args[]){
        String str="helloworld";
        //substring
        //System.out.println(str.substring(0,5));
        System.out.println(substring(str,0,5));

    }
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);

        }
        return substr;

    }
    
}
