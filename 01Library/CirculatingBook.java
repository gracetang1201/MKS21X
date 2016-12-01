public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    public CirculatingBook(String auth, String titl, String ISBNNum, String callNum){
	super(auth, titl, ISBNNum, callNum);
	currentHolder = "";
	dueDate = "";
    }
    public String getCurrentHolder(){
	return currentHolder;
    }
    public String getDueDate(){
	return dueDate;
    }
    public void setCurrentHolder(String newCH){
	currentHolder = newCH;
    }
    public void setDueDate(String newDD){
	dueDate = newDD;
    }
    public void checkout(String patron, String due){
	setCurrentHolder(patron);
	setDueDate(due);
    }
    public void returned(){
	setCurrentHolder("");
	setDueDate("");
    }
    public String circulationStatus(){
	if (getCurrentHolder().equals("")){
	    return "book available on shelves";
	}else{
	    return currentHolder + dueDate;
	}
    }
    public String toString(){
	return super.toString() + ", Current Holder: " + currentHolder + ", Due Date: " + dueDate;
    }
}
					       
