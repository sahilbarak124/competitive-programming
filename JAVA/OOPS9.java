public class OOPS9 {
    public static void main(String args[]){
        calculator calc=new calculator();
        System.out.println(calc.sum(5, 10));
        System.out.println(calc.sum(5, 10, 15));
        System.out.println(calc.sum(5.5f, 10.5f));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}