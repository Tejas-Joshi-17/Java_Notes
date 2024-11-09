// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 14) String Methods

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_14 {
    public static void main(String[] args) {

        String Name = "Tejas Dattatray Joshi";

        // 1) str.length()  =  Returns Length of the String
        System.out.println("Length of String is :- " + Name.length());
        // Length of String is :- 21

        // 2) str.toLowerCase()  =  Returns New String with all characters in Lower-Case
        System.out.println("Lower-Cased String is :- " + Name.toLowerCase());
        // Lower-Cased String is :- tejas dattatray joshi

        // 3) str.toUpperCase()  =  Returns New String with all characters in Lower-Case
        System.out.println("Upper-Cased String is :- " + Name.toUpperCase());
        // Upper-Cased String is :- TEJAS DATTATRAY JOSHI


        Name = "   T e jas  Dattatray  Jo shi";
        System.out.println(Name.trim());
        // T e jas  Dattatray  Jo shi

        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.substring(2));             // jas Dattatray Joshi
        System.out.println(Name.substring(2, 10));       // jas Datt


        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.replace("a", "A"));
        // TejAs DAttAtrAy Joshi


        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.startsWith("t"));             // false
        System.out.println(Name.startsWith("T"));             // true
        System.out.println(Name.startsWith("tejas"));         // false
        System.out.println(Name.startsWith("Tejas Datt"));    // true

        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.endsWith("i"));               // true
        System.out.println(Name.endsWith("I"));               // false
        System.out.println(Name.endsWith("joshi"));           // false
        System.out.println(Name.endsWith("ray Joshi"));       // true

        Name = "Tejas Joshi";
        System.out.println(Name.charAt(0));         // T
        System.out.println(Name.charAt(1));         // e
        System.out.println(Name.charAt(2));         // j
        System.out.println(Name.charAt(3));         // a
        System.out.println(Name.charAt(4));         // s
        System.out.println(Name.charAt(5));         //
        System.out.println(Name.charAt(6));         // J
        System.out.println(Name.charAt(7));         // o
        System.out.println(Name.charAt(8));         // s
        System.out.println(Name.charAt(9));         // h
        System.out.println(Name.charAt(10));        // i


        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.indexOf("eja"));                // 1
        System.out.println(Name.indexOf("eja", 3));        // -1
        System.out.println(Name.indexOf("a"));                  // 3
        System.out.println(Name.indexOf("a", 4));           // 7


        Name = "Tejas Dattatray Joshi";
        System.out.println(Name.lastIndexOf("eja"));          // 1
        System.out.println(Name.lastIndexOf("eja", 3));     // 1
        System.out.println(Name.lastIndexOf("a"));            // 13
        System.out.println(Name.lastIndexOf("a", 12));      // 10


        Name = "Tejas Joshi";
        System.out.println(Name.equals("Tejas Joshi"));       // true
        System.out.println(Name.equals("TejaS Joshi"));       // false


        Name = "Tejas Joshi";
        System.out.println(Name.equalsIgnoreCase("Tejas Joshi"));     // true
        System.out.println(Name.equalsIgnoreCase("TejaS Joshi"));     // ture

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------