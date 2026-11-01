public class OOPS5 {
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
         s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
       
     }    

    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[]=new int[3];
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
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
    

