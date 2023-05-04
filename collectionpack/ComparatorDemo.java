package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
int age;
String name;

public Employee(int age, String name){
    this.age=age;
    this.name=name;

}
@Override
public String toString(){
    return "Employee [age= "+age+", name= "+name+"]";
}
@Override
public int compareTo(Employee o1){
    if(this.age>o1.age){
        return 1;
    }else{
        return -1;
    }
}
   
    
}
public class ComparatorDemo {
    public static void main(String[] args){
        Comparator<Employee> com = (o1, o2)->o1.age>o2.age?1:-1;

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(23, "Dona"));
        list.add(new Employee(24, "Thomas"));
        list.add(new Employee(25, "Chandini"));
        list.add(new Employee(26, "Alan"));
        list.add(new Employee(27, "Sagar"));

        Collections.sort(list);
        Collections.sort(list,com);
        System.out.println(list);
        for(Employee e: list){
            System.out.println(e);
        }

    }
    
}
