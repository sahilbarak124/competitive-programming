public class OOPS20 {
    public static void main(String args[]){
        Test.changeB();
        System.out.println("Value of b: " + Test.b); // This will print "
    }
}
class Test{
    static int a=10;
    static int b;
    static void changeB(){
        b=a*3;
    }
}