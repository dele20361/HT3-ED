import java.util.Scanner;

/**
 * Class in charge of the visual representation of the program
 * @author Paola De León
 * @author Jeyner Arango
 */
public class Vista {

    // Properties
    Scanner scan = new Scanner ( System.in );

    // System.out.println();
    
    /**
     * Welcome.
     * @author Paola De León
     */
    public void Welcome ( ) {
        System.out.println("\n\nBienvenido!");
    }


    /**
     * Method to scan a number.
     * @return int Number.
     * @author Paola De León
     */
    public int InputInt ( ) {
        int num = 0;
        boolean parsed = false;
        while ( parsed == false ) {
            System.out.println("\nIngresa un numero entre 10 y 3000: ");
            String numS = scan.nextLine();
            num = ValideNum(numS);
            if (num!=-1){
                parsed = true;
            }
        }
        
        return num;
    }


    /**
     * Method to validate an int input.
     * @param numS String scanned.
     * @return int String parsed into an int. (if int equals to -1 the String wasn't parsed).
     * @author Paola De León
     */
    private int ValideNum ( String numS ) {
        int num = 0; 
        try {
            num = Integer.parseInt(numS);
        } catch (Exception e) {
            System.out.println("Error. Ingrese un numero valido");
            num = -1;
        }
        
        return num;
    }


    /**
     * Method to desplay the menu
     * @return int Chosen option
     * @author Paola De León
     */
    public int Menu() {
        boolean continuar = true;
        int num = 0;
        int opc = 0;
        while (continuar==true) {
            System.out.print("\n\nMENU\n\n"
            + "1) Gnome sort\n"
            + "2) Merge sort\n"
            + "3) Quick sort\n"
            + "4) Radix sort\n"
            + "5) Bubble sort\n"
            + "6) Salir\n"
            + "Ingrese el numero de opción a escoger: ");
            String numS = scan.nextLine();
            num = ValideNum(numS);
            if (num!=-1) {
                opc = num;
                continuar=false;
            }
        }

        return opc;
    }


    /**
     * Exit message
     * @author Paola De León
     */
    public void Exit ( ) {
        System.out.println("Saliendo...");
    }


    /**
     * Error message
     * @author Paola De León
     */
    public void ErrorFile ( ) {
        System.out.println("Error al crear archivo...");
    }

}
