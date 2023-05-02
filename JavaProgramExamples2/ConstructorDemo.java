class Calculator{
    public Calculator(int a, int b){
        int sum= a+b;
        System.out.println("Result of sum = "+sum);
    }
}

public class ConstructorDemo{
    public static void main(String[] args){
        Calculator add = new Calculator(100, 50);

    }
}