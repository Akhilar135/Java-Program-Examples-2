  class Person{
   
   int age;
   String name;
     void display(){
        System.out.println(this.name);
        System.out.println(this.age);
     }

     void show(){
        System.out.println("Show person");
        


    }

   }

class Engineer extends Person{
// *****override*****
     void show(){
        System.out.println("Show Engineer");
    }
}

class Doctor extends Person{
    void show(){
        System.out.println("Show Doctor");
    }
}

class Singer extends Person{
    void show(){
        System.out.println("Show Singer");
    }
}


public class InheritenceDemo{
    public static void main(String[] args){
Engineer engineer1 = new Engineer();
engineer1.name="Akhila";
engineer1.age=23;
engineer1.show();
engineer1.display();

Doctor doctor1 = new Doctor();
doctor1.name="Akhil";
doctor1.age=25;
doctor1.show();
doctor1.display();



Singer singer1= new Singer();

singer1.name="Ananthu";
singer1.age=28;
singer1.show();
singer1.display();

    }
}