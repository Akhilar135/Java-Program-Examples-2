package collectionpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args){

        List <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(1);

        System.out.println("List");
        System.out.println(list);
        for(int n1:list){
            System.out.println(n1);
        }

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        System.out.println("Set");
        System.out.println(set);
        for(int n2:set){
            System.out.println(n2);
        }

        Map<String, Integer> student = new HashMap<>();
        student.put("Dona", 23);
        student.put("Thomas", 24);
        student.put("Chandini", 25);
        student.put("Alan", 26);
        student.put("Sagar", 27);

        System.out.println(student);
        System.out.println(student.get("Dona"));

        System.out.println(student.keySet());

        for(String name: student.keySet()){
            System.out.println(name+" -->  "+student.get(name));

        }
        for(Integer age: student.values()){
            System.out.println(age+" -->  "+student.get(age));




    }
    
}
}
