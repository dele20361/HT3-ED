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

        ArrayList<Integer> Copy1Numbers = new ArrayList<>(Numbers);
        ArrayList<Integer> Copy2Numbers = new ArrayList<>(Numbers);
        ArrayList<Integer> Copy3Numbers = new ArrayList<>(Numbers);
        ArrayList<Integer> Copy4Numbers = new ArrayList<>(Numbers);
        ArrayList<Integer> Copy5Numbers = new ArrayList<>(Numbers);

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
                    v.PrintList(Copy1Numbers);
                    s.GnomeSort(Copy1Numbers);
                    v.PrintList(Copy1Numbers);
                    
                    break;
            
                case 2:
                    // Merge sort
                    v.PrintList(Copy2Numbers);
                    Numbers = s.MergeSort(Copy2Numbers);
                    v.PrintList(Copy2Numbers);
                    break;
            
                case 3:
                    // Quick sort
                	int[] list = s.arrayListToInt(Numbers);
                	//int[] newList = s.quickSort(list, 0, list.length);
                	//Numbers = s.intArrayToArrayList(newList);
                    break;
            
                case 4:
                    // Radix sort
                	//int[] list = s.arrayListToInt(Numbers);
                	//int[] newList = s.radixSort(list, 0, list.length);
                	//Numbers = s.intArrayToArrayList(newList);
                    break;
            
                case 5:
                    // Bubble sort
                    v.PrintList(Copy5Numbers);
                    s.BubbleSort(Copy5Numbers);
                    v.PrintList(Copy5Numbers);
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
