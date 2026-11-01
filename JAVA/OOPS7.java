public class OOPS7 {
    public static void main(String args[]){
        dog jimmy=new dog();
        jimmy.eat();
        jimmy.breath();
        jimmy.walk();
        jimmy.bark();
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
class dog extends Mammal{
    void bark(){
        System.out.println("barking...");
    }
}
