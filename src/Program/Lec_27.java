// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 27) For-each Loop

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_27 {
    public static void main(String[] args) {

        // -------------------------------------------------------------------------------
        int[] marks1 = {10, 20, 30, 40, 50, 60};
        System.out.println(marks1.length); // gives length of array i.e. 6

        // Dispalying array
        for (int i = 0; i < marks1.length; i++) {
            System.out.println(marks1[i]);
        }

        // Dispalying array in Reverse order
        for (int i = marks1.length - 1; i >= 0; i--) {
            System.out.println(marks1[i]);
        }

        // Dispalying array
        for (int element : marks1) {
            System.out.println(element);
        }
        // -------------------------------------------------------------------------------


        // -------------------------------------------------------------------------------
        char[] marks2 = {'a', 'b', 'c', 'd'};
        System.out.println(marks2.length); // gives length of array i.e. 6

        // Dispalying array
        for (int i = 0; i < marks2.length; i++) {
            System.out.println(marks2[i]);
        }

        // Dispalying array in Reverse order
        for (int i = marks2.length - 1; i >= 0; i--) {
            System.out.println(marks2[i]);
        }

        // Dispalying array
        for (char element : marks2) {
            System.out.println(element);
        }
        // -------------------------------------------------------------------------------


        // -------------------------------------------------------------------------------
        float[] marks3 = {12.0f, 33.0f, 45.6f, 58.3f};
        System.out.println(marks3.length); // gives length of array i.e. 6

        // Dispalying array
        for (int i = 0; i < marks3.length; i++) {
            System.out.println(marks3[i]);
        }

        // Dispalying array in Reverse order
        for (int i = marks3.length - 1; i >= 0; i--) {
            System.out.println(marks3[i]);
        }

        // Dispalying array
        for (float element : marks3) {
            System.out.println(element);
        }
        // -------------------------------------------------------------------------------


        // -------------------------------------------------------------------------------
        String[] marks4 = {"Tejas", "Saurabh", "Vaibhav", "Aakash"};
        System.out.println(marks4.length); // gives length of array i.e. 6

        // Dispalying array
        for (int i = 0; i < marks4.length; i++) {
            System.out.println(marks4[i]);
        }

        // Dispalying array in Reverse order
        for (int i = marks4.length - 1; i >= 0; i--) {
            System.out.println(marks4[i]);
        }

        // Dispalying array
        for (String element : marks4) {
            System.out.println(element);
        }
        // -------------------------------------------------------------------------------

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------