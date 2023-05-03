package innerclasspack;

 class A {
    int num;

    public void showMethod(){
        System.out.println("show class");
    }

    static class B{
        public void showMethod(){
            System.out.println("show innerclass");

        }

    }
}
public class InnerclassDemo {
    public static void main(String[] args){
        A obj1 = new A();
        obj1.showMethod();

        A.B obj2 = new A.B();
        obj2.showMethod();


    }
    
}
