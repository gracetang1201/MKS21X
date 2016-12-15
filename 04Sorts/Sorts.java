import java.util.Arrays;
public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static void main (String[]args){
	int[] myIntArray = new int[]{5, 0, 1};
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
	int tempID = 0;
	int counter;
	for (int i = 0; i < data.length-1; i++){
	    counter = data[i];
	    for (int d = i; d < data.length; d++){
		if (data[d] <= counter){
		    tempID = d;
		    counter = data[d];
		}
	    }
	    data[tempID] = data[i];
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
}



