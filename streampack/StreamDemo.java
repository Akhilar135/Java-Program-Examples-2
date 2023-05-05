package streampack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo{

    //private static Stream<Integer> stream;
    public static void main(String[] args){

List <Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(9);
list.add(8);
list.add(7);
list.add(6);

// Stream <Integer> stream = list.stream();
// // stream.forEach((t)->System.out.println(t));


// Stream<Integer> evenStream = stream.filter(a->a%2==0);
// // evenStream.forEach((t1)->System.out.println(t1));

// Stream <Integer> mapStream = evenStream.map(b->b+5);
// // mapStream.forEach((t2)->System.out.println(t2));

// int sum = mapStream.reduce(0,(c,d)->c+d);
// System.out.println(sum);


// int result = list.stream().filter(a->a%2==0).map(b->b+5).reduce(0,(c,d)->c+d);
// System.out.println(result);


Stream<Integer> sortStream = list.stream().filter(a->a%2==0).sorted();
sortStream.forEach((t4)->System.out.println(t4));
    }
}