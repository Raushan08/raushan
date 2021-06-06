package SetData.Lesson1.setProject;

public class Library {
    private Book[] books = new Book[6];

    public Library() {
    }


    void setBooks(Book[] b ) {

        if (b.length <=6) {
            for (int i = 0; i < books.length; i++) {
                this.books[i]=b[i];

            }

        }else {
            System.out.println("You added more than you should");

        }
    }

    void getBooks(){
        for (int i = 0; i < books.length; i++) {
            books[i].getBookData();

        }
    }

}
