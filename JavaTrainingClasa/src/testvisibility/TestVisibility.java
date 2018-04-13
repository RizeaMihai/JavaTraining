/*
Test Visibility
 */
package testvisibility;

import package1.*;
import package2.*;

/**
 *
 * @author Cristina Coman
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beta b = new Beta();
        b.testA();
        Gamma g = new Gamma();
        g.testA();
    }
    
}
