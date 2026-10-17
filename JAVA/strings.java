import java.util.*;
public class strings {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'a','b','c'};
        String str="hello";
        String str2=new String("st#&*13");
        System.out.println(str);
        System.out.println(str2);
        //Strings are immutable in java

        //input output in strings
        Scanner sc=new Scanner(System.in);
        String name;
        name =sc.nextLine();
        System.out.println(name);        
        
        //length of string
        System.out.println(name.length());
        
        //string concatenation
        String firstname="sahil";
        String lastname="barak";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        //string charAt()
        System.out.println(name.charAt(1));

        //calling
        printletters(name);

    }
    
}
