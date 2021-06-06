package SetData.Lesson1.setProject;

public class ScientificBook extends Book{
    private int price;
    private String publisher;




    ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }




    void getBookData() {
        System.out.println("A name of book: " + super.name + "; A code:  " + super.code  + "; The pages:  " + super.pages +
                "; A price: " + price + "; A publisher: " + publisher);
    }


}
