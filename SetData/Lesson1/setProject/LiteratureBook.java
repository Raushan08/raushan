package SetData.Lesson1.setProject;

public class LiteratureBook extends Book {
    private String author;
    private int publishedYear;



    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }



    void getBookData() {
        System.out.println("A name of book: " + super.name + "; A code:  " + super.code  + "; The pages:  " + super.pages +
                "; An author: " + author + "; A year: " + publishedYear);
    }
}
