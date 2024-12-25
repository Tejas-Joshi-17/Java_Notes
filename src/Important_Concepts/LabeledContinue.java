// ------------------------------------------------------------------------------------------------------------------------------------

// Labeled Continue :- Use to continue from loop having label passed

// ------------------------------------------------------------------------------------------------------------------------------------

package Important_Concepts;

public class LabeledContinue {
    public static void main(String[] args) {

        lable1:     // <---- Label for Parent while Loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Value of i :- " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("Value of j :- " + j);
                if (j == 2) {
                    continue lable1;
                }
            }
        }
    }
}
// Value of i :- 0
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of i :- 1
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2
// Value of i :- 2
// Value of j :- 0
// Value of j :- 1
// Value of j :- 2

// ------------------------------------------------------------------------------------------------------------------------------------