public class OOPS4 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="John";
        s1.roll=101;
        s1.password="1234";
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;
        Student s2=new Student(s1);//copying the values of s1 to s2
        s2.password="5678";
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s1.marks[2]=100;

    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    //Constructor
    //shallow copy
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    Student(){
        marks=new int[3];
        System.out.println("Constructor called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }


}
