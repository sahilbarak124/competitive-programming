

public class ifelse {
    public static void main(String args[]){
        int age=22;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        if(age>13 && age<18){
            System.out.println("You are a teenager");
        }
        
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
