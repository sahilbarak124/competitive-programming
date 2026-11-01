public class OOPS19 {
    public static void main(String args[]){
        Test t1 = new Test();
        t1.Setmarks(85);
        System.out.println("Marks: " + Test.marks); // This will print "Marks: 85"

    }
}
class Test{
    static int marks;
    void Setmarks(int marks){
        //Test.marks = marks;
        this.marks = marks; // This will cause a compilation error because 'marks' is static and cannot be accessed through 'this'
    }
}
