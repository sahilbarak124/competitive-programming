public class OOPS14 {
    public static void main(String args[]){
        bear b=new bear();
        b.eatMeat();
        b.eatGrass();
    }
}
interface carnivore{
    void eatMeat();
}
interface herbivore{
    void eatGrass();
}
class bear implements carnivore,herbivore{
    public void eatMeat(){
        System.out.println("eating meat");
    }
    public void eatGrass(){
        System.out.println("eating grass");
    }
}
