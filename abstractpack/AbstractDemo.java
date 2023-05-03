package abstractpack;


abstract class ElectronicItems{
    public abstract void showFunction();

    public void display(){
        System.out.println("Electronic Item");
    }
}

class Laptop extends ElectronicItems{

@Override
public void showFunction(){
    System.out.println("Laptop is a personal computer");
}
}
class Refrigerator extends ElectronicItems{
    @Override
    public void showFunction(){
    System.out.println("Refrigerator keep food fresh");
}
}
 public class AbstractDemo{
    public static void main(String[] args){
        ElectronicItems obj1 = new Laptop();
        obj1.display();
        obj1.showFunction();



    }
}