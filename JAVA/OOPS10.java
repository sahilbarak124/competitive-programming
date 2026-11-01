public class OOPS10 {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("eats everything");
    }
}
class Deer{
    void eat(){
        System.out.println("eats grass");
    }
}
