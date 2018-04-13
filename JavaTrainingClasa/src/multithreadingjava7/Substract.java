/*
 * Class decrease the value of Counter
 */
package multithreadingjava7;

/**
 * Class decrease the value of Counter
 * @author Mihai Rizea
 */
public class Substract extends Thread{
    private Counter cSub;
    public Substract(Counter counterFromMain){
    cSub=counterFromMain;
    }
    @Override
    public void run(){
    //Counter c = new Counter();
        for(int i=0; i<500;i++){
        cSub.decrement();
        System.out.println("Decremented to: "+cSub.value());
        }
    }
    
}
