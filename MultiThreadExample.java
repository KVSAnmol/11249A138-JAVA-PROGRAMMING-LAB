class NumberThread1 extends Thread{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Thread 1:" + i);
        }
    }
}
class NumberThread2 extends Thread{
    public void run(){
        for ( int i = 6; i <= 10; i++){
            System.out.println("Thread 2:" + i);
        }

    }
}

public class MultiThreadExample {
    public static void main(String[] args){
        NumberThread1 t1 = new NumberThread1();
        NumberThread2 t2 = new NumberThread2();
        t1.start();
        t2.start();

    }
}
