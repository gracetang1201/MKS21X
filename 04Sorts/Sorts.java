import java.util.Arrays;
public class Sorts{
    
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
	return "06.Tang.Grace"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	/*  
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
	*/
	int []newArr;
	newArr = new int[data.length];
	
	    
    }
    public static void main(String[] args){
	int[] anArray = { 
	    300, 200, 300,
	    400, 500, 600, 
	    700, 800, 900, 1000
	};
	selectionSort(anArray);
	System.out.println(Arrays.toString(anArray));
	
    }

}
