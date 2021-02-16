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
}
