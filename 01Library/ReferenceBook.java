public class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String auth, String titl, String ISBNNum, String callNum, String collect){
	super(auth, titl, ISBNNum, callNum);
	/*
	setAuthor(auth);
	setTitle(titl);
	setISBN(ISBNNum);
	setCall(callNum);
	*/
	collection = collect; 
    }
    public String getCollection(){
	return collection;
    }
    public void setCollection(String newColl){
	collection = newColl;
    }
    public void checkout(String patron, String due){
	System.out.println(patron + "cannot check out a reference book.");
    }
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible.");
    }
    public String circulationStatus(){
	return("non-circulating reference book");
    }
    public String toString(){
	return super.toString() + ", Collection: " + collection;
    }
}
