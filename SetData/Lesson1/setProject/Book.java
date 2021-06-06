package SetData.Lesson1.setProject;

public class Book {
    String name;
    String code;
    int pages;


    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }



    void getBookData() {
        System.out.println("Name of book: " + name + "Th code: " + code + "pages: " + pages);

    }


}



