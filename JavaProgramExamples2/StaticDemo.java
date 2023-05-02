 class Student{

    int id;
    String name;
    //static variable
   static String college;

//constructor
    public Student(int i, String n){
        id = i;
        name=n;

    }
    void display(){
        System.out.println(id+" "+name+" "+college);
    }
}
    public class StaticDemo{

    public static void main(String[] args){
        Student s1=new Student(101, "Akhila");
        Student s2=new Student(102, "Akhil");

        Student.college="TKMCE";

        s1.display();
        s2.display();


    }
    }
