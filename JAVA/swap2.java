 import java.util.*;
public class swap2 {
    public static int calculatesum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
   
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a= "+a);
        System.out.println("After swapping: b= "+b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        swap(a,b);
    }
    
} 
    

