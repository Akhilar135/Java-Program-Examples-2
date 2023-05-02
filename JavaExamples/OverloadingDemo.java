//*****Overloading *****

class Add{  

    static int add(int a,int b)
    {
        return a+b;
    }  

    static int add(int a,int b,int c){
        return a+b+c;
    }  

    }  
    class OverloadingDemo{  
    public static void main(String[] args){ 

    System.out.println(Add.add(10,11)); 

    System.out.println(Add.add(10,11,12));  
    }
}  