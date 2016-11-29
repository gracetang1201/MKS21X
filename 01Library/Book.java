public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
    }

    public Book(String auth, String titl, String ISBNNum){
	author = auth;
	title = titl;
	ISBN = ISBNNum;
    }
    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }
}
