public class OOPS18{
    public static void main(String args[]){
        System.out.println("Number of Book objects created: " + Book.count); // This will print "Number of Book objects created: 0"
        Book b1=new Book(100);
        Book b2=new Book(200);
        System.out.println("Number of Book objects created: " + Book.count); // This will

    }
}
class Book{
    int price;
    static int count;// Static variable to keep track of the number of Book objects created
    public Book(int price){
        this.price = price;
        count++; // Increment the count each time a new Book object is created
    }

}