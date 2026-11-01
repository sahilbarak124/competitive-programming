public class OOPS8 {
    public static void main(String args[]){
        Mammal jimmy=new Mammal();
        jimmy.eat();
        jimmy.breath();
        bird parrot=new bird();
        parrot.eat();   
        parrot.breath();
        fish nemo=new fish();
        nemo.eat();
        nemo.breath();

    }
}
class animal{
    void eat(){
        System.out.println("eating...");
    }
    void breath(){
        System.out.println("breathing...");
    }
}
class Mammal extends animal{
    void walk(){
        System.out.println("walking...");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("flying...");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("swimming...");
    }
}
