public class SuperArray{
  private String[] data;
  private int size;

  
    public SuperArray(){
	size = 0;
	data = new String [10];
	
    }

    public SuperArray(int initialCapacity){
	if (initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String [initialCapacity];
	
    }

    public static void main(String[] args) {
	SuperArray k13h  = new SuperArray(); 
	System.out.println(k13h.toString());
	System.out.println(k13h.add("5"));
	/*
	System.out.println(k13h.add(6));
	System.out.println(k13h.toString());
	k13h.add(0, 1);
	System.out.println(k13h.toString());
	
	System.out.println(k13h.toStringDebug());
	System.out.println(k13h.getSize());
	
	System.out.println(k13h.add(5)); 
	System.out.println(k13h.set(0, 5));
	System.out.println(k13h.toString());
	
	System.out.println(k13h.indexOf(5));
	*/
	System.out.println(k13h.lastIndexOf("5"));
	
	System.out.println(k13h.indexOf("0")); 
	//System.out.println(k13h.lastIndexOf(0));
	/*
	
	System.out.println(k13h.toStringDebug());
	int[] k13hArr = new int[k13h.getSize()] ;
	System.out.println("FROM HERE:");
	System.out.println(k13h.remove(0));
	System.out.println(k13h.toStringDebug());
	System.out.println(k13h.getSize());
	System.out.println(k13h.get(0));
	/*
	k13h.clear();
	
	System.out.println(k13h.getSize());	
	System.out.println(k13h.isEmpty());
	System.out.println(k13h);
	*/
	

    }

    public int getSize(){
	return size;
    }


  //1

    public boolean add (String n){

	if (data.length == size){
	    grow();
	}else{
	    data[size] = n;
	}
	size = size + 1;
	return true;
    }

 private void grow(){
      String[]temp;
      temp = new String [2*data.length];
      for (int i = 0; i < size; i++){
	  temp[i] = data[i];
      }
      data = temp;
  }

    public String get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
 
    }
	
	    

/* add the value n to the next available slot in the superArray.

 *this will change the size. This function should always work

 *And will resize the SuperArray if needed. */


/* *Resize the data, by making a new array, then copying over elements, use this as your data.

*/


 
  //3

   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/

  public String toString(){
      int i = 0;
      String ans = "[";
      for(i = 0; i < size; i++) {
	      
	      if (i == size - 1){
		  ans = ans + data[i];
      
	      }else{
	      ans = ans + data[i] + ", ";
	      }
           
      
  }
      return ans + "]";
  }
 

  //4

    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */

  public String toStringDebug(){
      String ans2 = "[";
       for(int i = 0; i < data.length; i++){
	   if (i < size){
	       ans2 += data[i] + ", ";
	   }
	   else{
	       if ( i == data.length - 1){
		   ans2 += "_";
	       }else{
	       ans2 +=  "_, ";
	       }
	   }
        }
       return ans2 + "]";
  }


    public void clear(){
	size = 0;
    }

    
    public boolean isEmpty(){
	return (size == 0);
    }

    public String set(int index, String element){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	String n = data[index];
	/*int[]temp;
	temp = new int[size - index];
        for (int i = 0; i < size; i++){
	    temp[i] = data[i];
	    }*/
	data[index] = element;
	return n;
    }

    public void add(int index, String element){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	size++;
	 if(size == data.length){
		grow();
	    }
	for (int i = size-1; i > index; i--){
	    
	   
	    data[i] = data[i-1];
	}
	data[index] = element;
	
    }

    public String remove(int index){
	
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	/*
	int[]temp;
	temp = new int[size];
        for (int i = 0; i < size; i++){
	    temp[i] = data[i];
	}
	for (int i = 0; i < size; i++){
	    if (i > index){
		data [i] = data [i - 1];
	    }
	}
	data = temp;
	size = size - 1;
	return temp[index];
	*/

	size--;
	String original = data[index];
	for(int i = index; i < size; i++){
	    data[i] = data[i+1];

	}
	return original;
    }

    public String[] toArray(){
	String[]temp;
	temp = new String[size];
	for(int i = 0; i < size; i++){
	    data[i] = temp[i];
	}
	return temp;
    }

    public int indexOf(String i) {
	int ans = 0;
	//	int counter = 0;
	for (int index  = 0; index < size; index++){
	    if ( (data[index]).equals(i) ){
		//	counter = counter + 1;
		ans = index;
		break;
	    }else{
		ans = -1;
	}

	    
	
    }
	return ans;
    }

    public int lastIndexOf(String i){
	int counter = 0;
	for (int index  = size - 1; index >= 0; index--){
	    if ((data[index]).equals(i)){
		counter = counter + 1;
		return index;
	    }
	}
	    return -1;	
    }

    public void trimToSize(){
	 String[]temp;
	 temp = new String[size];
	 for (int i = 0; i < size; i++){
	  temp[i] = data[i];
	 }
	 data = temp;
	
    }
  
}






