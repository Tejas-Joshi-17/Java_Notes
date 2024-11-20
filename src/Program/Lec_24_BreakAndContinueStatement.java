// ------------------------------------------------------------------------------------------------------------------------------------------------------

// 24) Break & Continue Statement

// ------------------------------------------------------------------------------------------------------------------------------------------------------


package Program;

public class Lec_24_BreakAndContinueStatement {
    public static void main(String[] args) {

        // 1) break - while Loop
        int a = 0;
        while (a <= 5) {
            System.out.println(a);
            if (a == 2)
                break;
            a++;
        }


        // 2) break - do-while Loop
        int x = 0;
        do {
            System.out.println(x);
            if (x == 2) {
                System.out.println("Loop ends Here");
                break;
            }
            x++;
        } while (x <= 5);


        // 3) break - for Loop
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            if (i == 2) {
                System.out.println("Loop ends Here ");
                break;
            }
        }


        // 4) continue - while Loop
        int k = 0;
        while (k <= 5) {
            k++;
            if (k == 2) {
                continue;
            }
            System.out.println(k);
        }


        // 5) continue - do-while Loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
            if (i == 2) {
                System.out.println("Ends...!");
                continue;
            }
        } while (i <= 5);


        // 6) continue - for Loop
        for (int b = 0; b <= 5; b++) {
            if (b == 2) {
                System.out.println("Ends...!");
                continue;
            }
            System.out.println(b);
        }

    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------------------