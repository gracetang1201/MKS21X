import java.util.Arrays;
public class Sorts{
    
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static void main (String[]args){
	int[] myIntArray = new int[]{};
	insertionSort(myIntArray);
	System.out.println( Arrays.toString( myIntArray ) );
    }
    public static String name(){
	return "06.Tang.Grace"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	
	int tempind = 0;
	int counter = data[0];
	for (int i = 0; i < data.length - 2; i++){
	    for (int d = i; d < data.length - 1; d++){
		if (data[d] <= counter){
		    counter = data[d];
		    tempind = d;
		}
	    }
	    data[tempind] = data[i];
	    data[i] = counter;
	    
	}
    }
	
	    
   


	
    public static void insertionSort(int[] data){
	for( int i = 1; i < data.length; i++){
	    for( int d = i; d > 0; d--){
		if(data[d] < data[d-1]){
		    int temp = data[d];
		    data[d] = data[d-1];
		    data[d-1] = temp;
		}
		
	    }
	}
    }
    public static void bubbleSort(int[] data){
	boolean swapped = true;
	while (swapped){
	    swapped = false;
	    for(int numsignore = 0; numsignore < data.length; numsignore++){
		for (int i = 0; i < numsignore; i++){
		    if (data[i+1] < data[i]){
			swapped = true;
			int temp = data[i+1];
			data[i+1] = data[i];
			data[i] = temp;

		    }
		}
	    }
	}
    }
}
