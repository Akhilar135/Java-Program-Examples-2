package functionalinterface;

@FunctionalInterface
interface  Program{
    void showVariable(int a);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args){

        Program p = (int a)-> System.out.println("show "+a);
        p.showVariable(100);

        Program p1 = new Program() {

            public void showVariable(int a){
              System.out.println("show a in Anonymous "+a);  
                
            }
        };
        p1.showVariable(100);

    }
    
}
