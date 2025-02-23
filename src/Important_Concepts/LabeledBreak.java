// ------------------------------------------------------------------------------------------------------------------------------------

// Labeled Break :- Use to break from loop having label passed

// ------------------------------------------------------------------------------------------------------------------------------------


package Important_Concepts;

public class LabeledBreak {
    public static void main(String[] args) {

        lable1:     // <---- Label for Child while Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i :- " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Value of j :- " + j);
                if (j == 3) {
                    break lable1;
                }
            }
        }
    }
}
// Value of i :- 0
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of j :- 3

// ------------------------------------------------------------------------------------------------------------------------------------