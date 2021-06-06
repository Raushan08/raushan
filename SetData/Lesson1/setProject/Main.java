package SetData.Lesson1.setProject;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();


        Book b1 = new ScientificBook("Algebra", "0001", 365, 2500, "Atamura");
        Book b2 = new ScientificBook("Fizika", "0002", 258, 3000, "Almaty-baspa");
        Book b3 = new ScientificBook("Geometriya", "0003", 333, 2850, "Atamura");
        Book b4 = new LiteratureBook("Russian", "0004", 425, "Ivanov I.", 2002);
        Book b5 = new LiteratureBook("English", "0005", 302, "Sergeev I.", 2000);
        Book b6 = new LiteratureBook("kazakh", "0006", 298, "Pavlov I.", 2004);

        Book[] books = new Book[6];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        books[4] = b5;
        books[5] = b6;

        l.setBooks(books);
        l.getBooks();


    }
}
