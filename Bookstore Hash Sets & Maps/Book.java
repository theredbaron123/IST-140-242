/**
 * Book
 */
public class Book {

    private String bookTitle; 
    private int copiesRemaining;

    public Book(String bookTitle, int copiesRemaining) {
        this.bookTitle = bookTitle;
        this.copiesRemaining = copiesRemaining;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getCopiesRemaining() {
        return copiesRemaining;
    }

    public void setCopiesRemaining(int copiesRemaining) {
        this.copiesRemaining = copiesRemaining;
    }

    @Override
    public String toString() {
        return "Book [bookTitle=" + bookTitle + ", copiesRemaining=" + copiesRemaining + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
        result = prime * result + copiesRemaining;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (bookTitle == null) {
            if (other.bookTitle != null)
                return false;
        } else if (!bookTitle.equals(other.bookTitle))
            return false;
        if (copiesRemaining != other.copiesRemaining)
            return false;
        return true;
    }

    
    
}