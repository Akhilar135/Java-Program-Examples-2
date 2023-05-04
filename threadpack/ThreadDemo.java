package threadpack;


class ChildThread1 extends Thread{
public void run(){
    for (int i=0;i<=5;i++){
    System.out.println("ChildThread1 extends Thread<-------------");
    }
}
}

class ChildThread2 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
        System.out.println("-------------->ChildThread2 extends Thread");
        }
    }
}
public class ThreadDemo{
public static void main(String[] args) {
    ChildThread1 ch1 = new ChildThread1();
    ChildThread2 ch2 = new ChildThread2();

    ch1.start();
    ch2.start();
}
    
}