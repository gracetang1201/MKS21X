public class SuperArrayIterable implements Iterator<String>{
    private int index;
    private SuperArray supAr;

    public SuperArrayIterable(){
    }
    public boolean hasNext(){
	return(index < supAr.size() - 1);
    }
    public String next(){
	return supAr[i+1];
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
