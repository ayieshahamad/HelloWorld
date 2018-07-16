package july6;

public class Book {
    private String title;
    private String author;
    private int numOfCopies;
    private int numOfCopiesLend;

    public Book() {
        this.title = "";
        this.author = "";
        this.numOfCopies = 0;
        this.numOfCopiesLend = 0;
    }

    public Book(String title, String author, int numOfCopies, int numOfCopiesLend) {
        this.title = title;
        this.author = author;
        this.numOfCopies = numOfCopies;
        this.numOfCopiesLend = numOfCopiesLend;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public void setGetNumOfCopiesLend(int numOfCopiesLend) {
        this.numOfCopiesLend = numOfCopiesLend;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public int getNumOfCopiesLend() {
        return numOfCopiesLend;
    }

    public boolean loan(){
        //check if book is avaiable
        if(numOfCopiesLend < numOfCopies)
        {
            numOfCopiesLend++;
            return true;
        }
        else
            return false;
    }

    public boolean returnBook(){
        if(numOfCopiesLend>0) {
            numOfCopiesLend--;
            return true;
        }
        else
            return false;
    }

    public String toString(){
        return "Author : "+ author+
                "\nTitle : "+title+
                "\nNumber of Copies :"+numOfCopies+
                "\nNumber of Copies Lend "+numOfCopiesLend;
    }
}
