package interfacepack;

interface ElectronicItems{
public void showFunction();

}

interface PowerConsume{
    public void showPowerRating();
}

class Laptop implements ElectronicItems,PowerConsume{
    @Override
    public void showFunction() {
        System.out.println("Laptop");

        @Override

        public void showPowerRating() {
            System.out.println("Less power consumption");
        }


    }
}
class Refrigerator implements ElectronicItems{
    public void showFunction(){
        System.out.println("Refrigerator");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        ElectronicItems l1 = new Laptop();
        l1.showFunction();

        ElectronicItems r1 = new Refrigerator();
        r1.showFunction();

    }
}
