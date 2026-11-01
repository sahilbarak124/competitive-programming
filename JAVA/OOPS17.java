public class OOPS17 {
    public static void main(String[] args) {
        vehicle obj1 = new vehicle();
        obj1.print();
        vehicle obj2 = new car();
        obj2.print(); // This will call the print method of the car class due to polym
    }
}
class vehicle{
    void print(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("This is a car");
    }
}
