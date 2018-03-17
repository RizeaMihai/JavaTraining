/*
Test Cars
 */
package autoservice;

/**
 *
 * @author Mihai Rizea
 */
public class TestCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mertzanul = new Car(Car.Marca.Mercedes, Car.Culoare.BLACK, 230, 460, 50000);
        Car renaultul = new Car(Car.Marca.Renault, Car.Culoare.YELLOW, 180, 120, 2300);  
        Car dacie = new Car(Car.Marca.Dacia, Car.Culoare.RED, 60, 60, 999);
        
        
    }
    
}
