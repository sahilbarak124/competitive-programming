public class OOPS3 {
    public static void main(String args[]){
        Student S1=new Student();
        Student S2=new Student("John");
        Student S3=new Student(101);
        //Student S4=new Student("John",101); give error because we have not created a constructor with two parameters
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor called");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }

}
