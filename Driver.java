import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/**
 * Driver class of the program
 * 
 * @author Paola De León
 * @author Jeyner Arango
 */
public class Driver {
    public static void main(String[] args) {

        // Properties
        Vista v = new Vista();

        // Request number
        int num = v.InputInt();

        // Create ArrayList
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            Numbers.add(i, i);
        }

        // Create file
        File file = new File("Sorts.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            v.ErrorFile();
        }
    
        // Welcome
        v.Welcome();

        // Menu
        int opc = v.Menu();
        switch (opc) {
            case 1:
                // Gnome sort
                
                break;
        
            case 2:
                // Merge sort

                break;
        
            case 3:
                // Quick sort

                break;
        
            case 4:
                // Radix sort

                break;
        
            case 5:
                // Bubble sort
                
                break;
        
            case 6:
                v.Exit();
                break;

            default:
                break;
        }

    }
}
