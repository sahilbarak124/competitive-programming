public class OOPS12 {
    public static void main(String args[]){
        Mustang m= new Mustang();
        //animal->horse->Mustang
    }
}
abstract class animal{
    String color;
    animal(){
        System.out.println("animal is created");
    }
}
class horse extends animal{
    horse(){
        System.out.println("horse is created");
    }
    
}
class Mustang extends horse{
    Mustang(){
        System.out.println("Mustang is created");
    }
   
}


