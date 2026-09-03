public class swap1{
    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap (a, b);
        System.out.println("After swapping: a = " + a + ", b = " + b); 
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }
}