abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String auth, String titl, String ISBNNum, String call){
	setAuthor(auth);
	setTitle(titl);
	setISBN(ISBNNum);
	callNumber = call;
    }
    public String getCall(){
	return callNumber;
    }
    public void setCall(String newCall){
	callNumber = newCall;
    }
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    public int compareTo(LibraryBook o){
	if(
	       callNumber.equals(o.callNumber) &&
	       getAuthor().equals(o.getAuthor()) &&
	       getTitle().equals(o.getTitle()) &&
	       getISBN().equals(o.getISBN())){
	    return 0;
	}else{
	    return -1;
	}
    }
    public String toString(){
	
	//return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", callNumber: " + callNumber;
	return super.toString() + ", callNumber: " + callNumber;
    }
}
