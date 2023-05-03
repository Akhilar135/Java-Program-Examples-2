package exceptionhandle;

class ExceptionDemo {

    public void showMethod() {
        System.out.println("show method");
    }
}

public class ExceptionHandle {
    public static void main(String[] args)  {
        int a = 100;
        int b = 0;

        ExceptionDemo eh = new ExceptionDemo();
        eh = null;

        int arr[] = new int[3];

        
 
        try
        {
             if(b == 0) {
                throw new NewExceptionHandle("Invalid input");
             }
            // arr[4] = 10;
            //  b = a/0;
          eh.showMethod();
        }
        catch(ArithmeticException e) {
            System.out.println("show exception "+e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("exception due to array index"+ e);
        }
        catch(NullPointerException e) {
            System.out.println("exception due to null point"+ e);
        }
        catch(Exception e) {
            System.out.println("show exception "+e);
        }
        finally {
        }
        System.out.println("b = "+b);

        
    }
}
