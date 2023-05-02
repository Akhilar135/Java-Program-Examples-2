class Demo{

   public final void display(){
        System.out.println("Final method cannot be overridden");
}
}
// class Demo1 extends Demo{
// public void display(){
//     System.out.println("Final method");
// }
// }

public class FinalDemo{

    public static void main(String[] args){

        int num = 10;
        num = 20;
        System.out.println("Number is "+num);

        final int num2 = 10;
        System.out.println("Number is "+num2);

         Demo demo = new Demo();
         demo.display();

        //  Demo1 demo1= new Demo1();
        //  demo1.display();
        

    }
}
