// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 61) Exercise-4 Solution

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

// Online Library
class Library611 {
    String[] Books;
    int No_of_Books;

    Library611() {
        this.Books = new String[100];
        this.No_of_Books = 0;
    }

    void Add_Books(String book) {
        this.Books[No_of_Books] = book;
        No_of_Books++;
        System.out.println(book + " has been Added!!!");
    }

    void Show_Avaliable_Books() {
        System.out.println("Avaliable Books :- ");
        for (String book : this.Books) {
            if (book == null)
                continue;
            System.out.println("* " + book);
        }
    }

    void Issue_Book(String book) {
        for (int i = 0; i < this.Books.length; i++) {
            if (this.Books[i] == book) {
                System.out.println(book + " Issued!");
                this.Books[i] = null;
                return;
            }
        }
        System.out.println(book + " This Book dows not exist");
    }

    void Return_Book(String book) {
        Add_Books(book);
    }
}

public class Lec_61_Exercise4Solution {
    public static void main(String[] args) {

        Library611 Central_Library = new Library611();

        Central_Library.Add_Books("Think & Grow Rich");   // Think & Grow Rich has been Added!!!
        Central_Library.Add_Books("Algorithm - Gate");    // Algorithm - Gate has been Added!!!
        Central_Library.Add_Books("C Language - Gate");   // C Language - Gate has been Added!!!

        Central_Library.Show_Avaliable_Books();
        // Available Books :-
        // * Think & Grow Rich
        // * Algorithm - Gate
        // * C Language - Gate

        Central_Library.Issue_Book("DBMS - Gate");
        // DBMS - Gate This Book dows not exist

        Central_Library.Issue_Book("C Language - Gate");
        // C Language - Gate Issued!

        Central_Library.Show_Avaliable_Books();
        // Available Books :-
        // * Think & Grow Rich
        // * Algorithm - Gate

        Central_Library.Add_Books("DBMS - Gate");
        // DBMS - Gate has been Added !!!

        Central_Library.Show_Avaliable_Books();
        // Available Books :-
        // * Think & Grow Rich
        // * Algorithm - Gate
        // * DBMS - Gate

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------