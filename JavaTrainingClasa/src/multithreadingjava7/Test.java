/*
 * Tests threads sync
 */
package multithreadingjava7;

/**
 * Tests threads sync
 * @author Mihai Rizea
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c = new Counter();
        Add add = new Add(c);
        Substract sub = new Substract(c);
        System.out.println("Valoarea initiala a lui counter este " + c.value());
        add.start();
        sub.start();
        System.out.println("Valoarea finala a lui counter este "+c.value());
        
    }
    
}
