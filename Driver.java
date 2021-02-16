import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Random;

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
        Sorts s = new Sorts();

        // Request number
        int num = v.InputInt();
        Random rand = new Random();

        // Create ArrayList
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            int random = rand.nextInt(num);
            Numbers.add(i, random);
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
        int opc = 0;
        while (opc !=6) {
            // Menu
            opc = v.Menu();
            switch (opc) {
                case 1:
                    // Gnome sort
                    v.PrintList(Numbers);
                    s.GnomeSort(Numbers);
                    v.PrintList(Numbers);
                    break;
            
                case 2:
                    // Merge sort
                    v.PrintList(Numbers);
                    Numbers = s.MergeSort(Numbers);
                    v.PrintList(Numbers);
                    break;
            
                case 3:
                    // Quick sort

                    break;
            
                case 4:
                    // Radix sort

                    break;
            
                case 5:
                    // Bubble sort
                    v.PrintList(Numbers);
                    s.BubbleSort(Numbers);
                    v.PrintList(Numbers);
                    break;
            
                case 6:
                    v.Exit();
                    break;

                default:
                    v.Error();
                    break;
            }
        }

    }
}
