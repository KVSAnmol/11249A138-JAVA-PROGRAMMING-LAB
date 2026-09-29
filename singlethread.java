class SingleThread extends Thread{
    public void run(){
        for(int i =1; i <= 5; i++){
            System.out.println("number: " + i);
        }
    }
    public static void main(String[] args){
        SingleThread t = new SingleThread();
        t.start();
    }
}
