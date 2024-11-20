// -------------------------------------------------------------------------------------------------------------------------

// 113) Exercise-7 Solution :-

// -------------------------------------------------------------------------------------------------------------------------


/*
     Create a library management system which is capable of issuing books to the students.
     Book should have info like:
     1. Book name
     2. Book Author
     3. Issued to
     4. Issued on
     User should be able to add books, return issued books, issue books
     Assume that all the users are registered with their names in the central database
*/

package Program;

import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book " + book + " has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book " + book + " has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("The book " + book + " has been returned");
        this.books.add(book);
    }

}

public class Lec_113_Exercise7Solution {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("Algorithms", "CLRS");
        Book b2 = new Book("Algorithms2", "CLRS2");
        Book b3 = new Book("Algorithms3", "CLRS3");
        Book b4 = new Book("Algorithms4", "CLRS4");

        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);


        MyLibrary l = new MyLibrary(bk);

        l.addBook(new Book("algo4", "myAuthor"));
        // The book Book{name='algo4', author='myAuthor'} has been added to the library

        l.issueBook(b3, "Harry");
        // The book Book{name='Algorithms3', author='CLRS3'} has been issued from the library to Harry

        l.returnBook(new Book("C-Language", "Danis Riche"));
        // The book Book{name='C-Language', author='Danis Riche'} has been returned

    }
}

// -------------------------------------------------------------------------------------------------------------------------