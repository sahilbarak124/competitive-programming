public class OOPS6 {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
        shark.breath();
    }
}
//base class
class animal{
    void eat(){
        System.out.println("eating...");
    }
    void breath(){
        System.out.println("breathing...");
    }
}

//derived class
class Fish extends animal{
    int fins;
    void swim(){
        System.out.println("swimming...");
    }
}
