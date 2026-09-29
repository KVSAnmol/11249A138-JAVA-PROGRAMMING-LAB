class OddThread extends Thread{
    public void run(){
        for ( int i = 1; i <= 10; i++){
            if (i % 2 != 0) {
                System.out.println("Odd:" +i);
            }
        }
    }
}
class EvenThread extends Thread{
    public void run(){
        for ( int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println("Even:" + i);
            }
        }
    }
}
public class OddEven {
    public static void main(String[] args){
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        even.start();

    }
    
}
