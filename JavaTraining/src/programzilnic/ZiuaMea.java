/*
 java Program
 */
package programzilnic;

/**
 *
 * @author Cristina Coman
 */
public class ZiuaMea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Om eu = new Om();
        
        Zi oZiLucratoare = new Zi(true);
        
        eu.seTrezeste();
        eu.seSpala();
        if(oZiLucratoare.esteZiLucratoare() == true){
            eu.mergeLaJob();
        }
        else {
        eu.dorm();
        } 
    }
    
}
