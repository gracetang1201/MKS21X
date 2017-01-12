import java.util.Arrays;
public class Sorts{
<<<<<<< HEAD
    
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
=======
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static void main (String[]args){
	int[] myIntArray = new int[]{5, 0, 1};
	insertionSort(myIntArray);
	System.out.println( Arrays.toString( myIntArray ) );
    }
>>>>>>> 1821271cbce0a474cfef8322b4c30e1d88e4685b
    public static String name(){
	return "06.Tang.Grace"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
<<<<<<< HEAD
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
=======
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



>>>>>>> 1821271cbce0a474cfef8322b4c30e1d88e4685b
