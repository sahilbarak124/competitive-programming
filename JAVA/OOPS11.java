public class OOPS11 {
    public static void main(String args[]){
        horse h= new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        chicken c =new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        // animal a=new animal(); // This would cause a compile-time error since animal is abstract
    }
}
abstract class animal{
    String color;
    animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eating...");
    }
    abstract void walk();
}
class horse extends animal{
    void changeColor(){
        color="black";
    }
    void walk(){  // Implementing the abstract method
        System.out.println("walking on 4 legs...");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("walking on 2 legs...");
    }
}
