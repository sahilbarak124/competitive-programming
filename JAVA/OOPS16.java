public class OOPS16 {
    public static void main(String args[]){
        horse h = new horse();
        System.out.println("Horse color: " + h.color); // This will print "Horse color: brown"

    }
}
class Animal{
    String color;
    Animal() {// Constructor of the Animal class
        System.out.println("Animal class constructor called");
    }
}
class horse extends Animal{

    horse() {
        super(); // Call the constructor of the superclass (Animal)
        super.color = "brown";// Set the color property of the superclass (Animal) to "brown"
        System.out.println("Horse class constructor called");
    }
}
