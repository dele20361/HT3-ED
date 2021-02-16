import java.util.ArrayList;
import java.util.Collections;

/**
 * Class with sort types as methods
 * @author Ana Paola De León
 * @author Jeyner Arango
 */
public class Sorts {

    /**
     * Method to sort the numbers with GnomeSort.
     * @param Numbers ArrayList that contains all the numbers created.
     * @author Paola De León
     */
    public void GnomeSort ( ArrayList<Integer> Numbers ) {
        

        // int i = 1; // Position
        for (int i = 1; i < Numbers.size()-1 ; i++) {
            System.out.println (Numbers);
            if ( i == 0 || ( Numbers.get( i - 1 ) <= Numbers.get( i ) ) ) {
                
            } else {
                Collections.swap( Numbers, i, ( --i ) );
                i--;
            }
        }

    }
    
    
    /**
     * Method to sort numbers with Bubble Sort.
     * @param Numbers ArrayList that contains all the numbers.
     * @author Paola De León
     */
    public void BubbleSort ( ArrayList<Integer> Numbers ) {
        for (int i = 0; i < Numbers.size(); i++) {
            for (int j = 0; j < Numbers.size(); j++) {
                if ( Numbers.get(i) < Numbers.get(j) ) {
                    Collections.swap(Numbers, i, j);
                }
            }
        }
    }
    
    
    /**
     * Method to sort numbers wiht Merge Sort.
     * @param List ArrayList that contains numbers.
     * @return ArrayList sorted.
     * @author Paola De León
     */
    public ArrayList<Integer> MergeSort( ArrayList<Integer> List ) {
        
        // Check if the size of the ArrayList is equal to 1.
        if ( List.size() > 1 ) {

            int middle = (List.size())/2;
            // Create an ArrayList for the left side
            ArrayList<Integer> LeftSide = new ArrayList<Integer>();
            for (int i = 0; i < middle; i++) {
                LeftSide.add ( List.get(i) );
            }
            // Create an ArrayList for the right side
            ArrayList<Integer> RightSide = new ArrayList<Integer>();
            for (int i = middle; i < List.size(); i++) {
                RightSide.add( List.get(i) );
            }  

            ArrayList<Integer> Final = new ArrayList<Integer>();

            // Recusive call
            LeftSide = MergeSort(LeftSide);
            RightSide = MergeSort(RightSide);

            Final = Merge(LeftSide, RightSide);
            return Final;

        } else {
            return List;
        }

    }


    /**
     * Second method to sort numbers.
     * @param LeftSide Left side list.
     * @param RightSide Right side list.
     * @return ArrayList with numbers sorted.
     */
    private ArrayList<Integer> Merge( ArrayList<Integer> LeftSide, ArrayList<Integer> RightSide ) {
        
        ArrayList<Integer> Final = new ArrayList<Integer>();
        int LeftSideIndx = 0;
        int RightSideIndx = 0;

        while ( ( LeftSideIndx < LeftSide.size() ) || ( ( RightSideIndx < RightSide.size() ) ) ) {
            // Check if the left and right side have elements
            if ( ( LeftSideIndx < LeftSide.size() ) && ( RightSideIndx < RightSide.size() ) ) {
                // Compare to know witch number is greater.
                if ( LeftSide.get( LeftSideIndx ) <= RightSide.get( RightSideIndx ) ) {
                     Final.add( LeftSide.get( LeftSideIndx ) );
                     LeftSideIndx ++;
                } else {
                    Final.add( RightSide.get( RightSideIndx ) );
                    RightSideIndx ++;
                }
            } else if ( LeftSideIndx < LeftSide.size() ) {
                // If right arraylist doesn't have elements
                Final.add( LeftSide.get( LeftSideIndx ) );
                LeftSideIndx ++;
            } else if ( RightSideIndx < RightSide.size() ) {
                // If left arraylist doesn't have elements
                Final.add( RightSide.get( RightSideIndx ) );
                RightSideIndx ++;
            }

        }

        return Final;
    }

    
}
