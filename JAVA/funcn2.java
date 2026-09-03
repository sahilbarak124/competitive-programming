import java.util.*;
public class funcn2{
    public static void calculatesum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        calculatesum(a,b);
    }
}