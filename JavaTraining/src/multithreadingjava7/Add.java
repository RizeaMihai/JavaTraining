/*
 * Class add 1 to counter
 */
package multithreadingjava7;

/**
 * Class add 1 to counter
 * @author Mihai Rizea
 */
public class Add extends Thread {
    
    private Counter cAdd;
    public Add(Counter counterFromMain){
    cAdd = counterFromMain;
    
    }
    @Override
    public void run(){
    //Counter c = new Counter();
        for(int i=0; i<500;i++){
        cAdd.increment();
        System.out.println("Incremented to: "+cAdd.value());
        }
    }
    
}
