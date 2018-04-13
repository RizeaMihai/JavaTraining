/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai Rizea
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of setRentingPrice method, of class Car.
     */
    @Test
    public void testSetRentingPrice() {
        System.out.println("setRentingPrice");
        double rentingPrice = 100.0;
        Car instance = new Car(Car.Marca.Mercedes, Car.Culoare.BLACK, 230, 460, 50000);
        instance.setRentingPrice(rentingPrice);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(rentingPrice, instance.getDailyRentingPrice(),0.0);
    }

    /**
     * Test of setSalesPrice method, of class Car.
     */
    @Test
    public void testSetSalesPrice() {
        System.out.println("setSalesPrice");
        double salesPrice = 25000.0;
        Car instance = new Car(Car.Marca.Mercedes, Car.Culoare.BLACK, 230, 460, 50000);
        instance.setSalesPrice(salesPrice);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(salesPrice, instance.getSalesPrice(),0.0);
    }

    /**
     * Test of getSalesPrice method, of class Car.
     */
    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        Car instance = new Car(Car.Marca.Dacia, Car.Culoare.YELLOW, 120, 150, 5000);
        double salesPrice = 5000.0;
        double result = instance.getSalesPrice();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(salesPrice, instance.getSalesPrice(),0.0);
    }

    /**
     * Test of getDailyRentingPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentingPrice() {
        System.out.println("getDailyRentingPrice");
        Car instance = new Car(Car.Marca.Dacia, Car.Culoare.YELLOW, 120, 150, 5000);
        double DailyRentingPrice = 150.0;
        double result = instance.getDailyRentingPrice();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(DailyRentingPrice, instance.getDailyRentingPrice(),0.0);
    }

   
    
}
