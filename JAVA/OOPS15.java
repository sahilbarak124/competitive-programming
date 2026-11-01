public class OOPS15 {
    public static void main(String args[]){
        student s1=new student();
        s1.setname("Alice");
        System.out.println(s1.getname());
        // You can also set the school name using the class name since it's static
        s1.schoolName = "Greenwood High";
        student s2 = new student();
        System.out.println(s2.schoolName); // This will print "Greenwood High" for all instances of student
        s2.schoolName = " JMV";
        student s3 = new student();
        System.out.println(s3.schoolName); // This will also print "JMV"
        System.out.println(s1.schoolName); // This will also print "JMV"
    }
}
class student{
    String name;
    int rollno;
    static String schoolName;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
}