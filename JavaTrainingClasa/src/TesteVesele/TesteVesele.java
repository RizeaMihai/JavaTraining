/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteVesele;

/**
 *
 * @author Mihai Rizea
 */
public class TesteVesele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myName = "Mihai Rizea";

        StringBuffer myInitials = new StringBuffer();

        int length = myName.length();

 

        for (int i = 0; i < length; i++) {

            if (Character.isUpperCase(myName.charAt(i))) {

                myInitials.append(myName.charAt(i));

            }

        }

        System.out.println("My initials are: " + myInitials);
        
        try{
            generateException();
            System.out.println("Codul de dupa metoda generateException()"); //nu se executa pentru ca este inainte de catch
        }
        catch(ArithmeticException ae){
            System.out.println("Exceptie / by 0 catched in main()");
        } finally{
            System.out.println("Codul de dupa metoda generateException() din finally");
        }
        }
        
        // private static void generateException();
        private static void generateException() throws ArithmeticException{
            
            int i = 100;
            int j = 0;
            int k = i/j;
        
         System.out.println("Nu putem imparti cu zero");
        
    }

}
    
