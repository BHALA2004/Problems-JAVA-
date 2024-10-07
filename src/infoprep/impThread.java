package infoprep;

public class impThread extends Thread{
    public void run(){
       for(int i = 1;i<=10;i++){
           System.out.println("Hi World");
           try {
               sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
