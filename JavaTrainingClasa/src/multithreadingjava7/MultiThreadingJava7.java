/*
 *Program lauches to diffent threads
 */
package multithreadingjava7;

/**
 *
 * @author Mihai Rizea
 */
public class MultiThreadingJava7 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //am creat cele 2 threaduri
        HelloWorld thread1 = new HelloWorld();
        SalutLume thread2 = new SalutLume();
        //get default priorities
        //thread1.getPriority();
        //thread2.getPriority();
        //System.out.println("Prioritate thread1: " +thread1.getPriority());
        //System.out.println("Prioritate thread2: " +thread2.getPriority());
        //set priorities
        //thread2.setPriority(10);
        //thread1.setPriority(1);
        //start the threads
        thread1.start();
        Thread.sleep(4000);
        thread2.start();
        thread2.interrupt();
    }
    
}
