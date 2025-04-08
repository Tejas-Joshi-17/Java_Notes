// ---------------------------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

public class PrintF {
    public static void main(String[] args) {

        String name = "Tejas Joshi";
        int age = 23;
        double cgpa = 9.21;

        System.out.println("Hi, My Name is :- " + name + " Age is :- " + age + " & CGPA is :- " + cgpa);
        // Hi, My Name is :- Tejas Joshi Age is :- 23 & CGPA is :- 9.21

        System.out.printf("Hi, My Name is :- %s Age is :- %d & CGPA is :- %.2f", name, age, cgpa);
        // Hi, My Name is :- Tejas Joshi Age is :- 23 & CGPA is :- 9.21

    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------