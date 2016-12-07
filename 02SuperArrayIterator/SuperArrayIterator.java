import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    private int index;
    private SuperArray supAr;

    public SuperArrayIterator(SuperArray Arr){
	index = 0;
	supAr = Arr;
    }
    public boolean hasNext(){
	return(index < supAr.getSize());
    }
    public String next(){
	index++;
	return supAr.get(index-1);
	
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
