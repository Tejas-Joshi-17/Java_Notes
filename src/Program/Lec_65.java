// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 65) Creating Package in Java :-

// ------------------------------------------------------------------------------------------------------------------------------------------------------

package Program;

// Import all '.class' Files, So 'Lec_65_1.class' & 'Lec_65_2.class' must be present in 'com/company/' folder
// import com.company.*;


// import com.company.Lec_65_1;        // <---- Import '.class' File
// import com.company.Lec_65_2;        // <---- Import '.class' File.

public class Lec_65 {
    public static void main(String[] args) {

        Lec_65_1 l1 = new Lec_65_1();
        l1.Greet();         // Hello from Lec_65_1.class
        l1.main(args);      // This is Main Function - 65_1

        Lec_65_1 l2 = new Lec_65_1();
        l2.Greet();         // Hello from Lec_65_1.class
        l2.main(args);      // This is Main Function - 65_1

    }
}
// javac Lec_65.java
// java Lec_65


// ------------------------------------------------------------------------------------------------------------------------------------------------------