import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    
    /**
     * QuickSort sorting method for ordering data
     * @param array list of numbers to be sorted
     * @param begin start of the list
     * @param end end of the list
     * @author Jeyner Arango
     * @return 
     */
    public void quickSort(int[] array, int begin, int end) {
    	int location;
    	if (begin <= end) {
    		location = partition(array, begin, end);
    		quickSort(array, begin, location-1); //iterate left of partition
    		quickSort(array, location +1, end); // iterate right of partition
    	}
    }
    
    /**
     * Helper function for quickSort function
     * @param array partition list of numbers to be sorted
     * @param begin begin of the array
     * @param end end of the array
     * @return arrange partition
     * @author Jeyner Arango
     */
    private int partition(int[] array, int begin, int end) {
    	int pivot = array[end];
    	int i = begin - 1; // first element of the partition
    	
    	for (int j = begin; j<end; j++){
    		if (array[j] < pivot) {
    			i++;
    			int swapNumber = array[i];
    			array[i] = array[j];
    			array[j] = swapNumber;
    		}
    	}
    	int swapNumber = array[i+1];
    	array[i+1] = array[end];
    	array[end] = swapNumber;
    	return i+1;
    }
    
    /**
     * Helper to convert ArrayList<Integer> to int[]
     * @param numbers
     * @return int[] array
     * @author Jeyner Arango
     */
    public int[] arrayListToInt(ArrayList<Integer> numbers) {
    	int[] array = new int[numbers.size()];
    	int count = 0;
    	for(Integer n: numbers) {
    		array[count++] = n.intValue();
    	}
    	return array;
    }
    
    /**
     * Helper function to convert int[] to ArrayList<Integer>
     * @param array int[] array
     * @return arrayIntegerList a ArrayList<Integer> type
     * @author Jeyner Arango
     */
    public ArrayList<Integer> intArrayToArrayList(int[] array){
    	ArrayList<Integer> arrayIntegerList = new ArrayList<>();
    	for(int n:array) {
    		arrayIntegerList.add(Integer.valueOf(n));		
    	}
    	return arrayIntegerList;
    }
    
	/**
     * radixSort Function without the countingSort helper 
     * @param input
	 * @param length 
	 * @param j 
     */
    public void radixSort(int[] input, int j, int length) { 
    	final int RADIX = 10; 
    	
    	// declare and initialize bucket[] 
    	List<Integer>[] digitBox = new ArrayList[RADIX]; 
    	for (int i = 0; i < digitBox.length; i++) { 
    		digitBox[i] = new ArrayList<Integer>(); 
    	} 
    	
    	// sort 
    	boolean maxLength = false; 
    	int tmp = -1; 
    	int placement = 1; 
   
    	while (!maxLength) { 
    		maxLength = true; 
    	
    		// split input between lists 
    		for (Integer i : input) {
    			tmp = i / placement; 
    			digitBox[tmp % RADIX].add(i); 
    			if (maxLength && tmp > 0) {
    		maxLength = false; 
    			} 
    		} 
    	
	    	// empty lists into input array 
	    	int a = 0; 
	    	for (int b = 0; b < RADIX; b++) { 
	    		for (Integer i : digitBox[b]) {
    			input[a++] = i;
	    		} 
	    		digitBox[b].clear(); 
	    	} 
    	
	    	// move to next digit
	    	placement *= RADIX; 
	    } 
    } 

    
}
