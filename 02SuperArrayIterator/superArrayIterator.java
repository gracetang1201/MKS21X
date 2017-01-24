import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    private int index;
    private SuperArray supAr;

    public SuperArrayIterator(SuperArray Arr, int ind){
	index = ind;
	supAr = Arr;
    }
    public boolean hasNext(){
	return(index < supAr.getSize() - 1);
    }
    public String next(){
	return supAr.get(index+1);
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
