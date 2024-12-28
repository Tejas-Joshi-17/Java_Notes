package string;

import java.util.logging.Logger;

public class Basics1 {

    private static Logger logger = Logger.getLogger(Basics1.class.getName());

    public static void main(String[] args) {

        String name1 = "Rakesh";
        String name2 = "Rakesh";
        String name3 = new String("Rakesh");
        String name4 = new String("Rakesh");


        if (name1 == name2)
            logger.info("Both are same");           // Both are same

        if (name1 == name3) {
            logger.info("Both are same");
        } else {
            logger.info("Both are different");      // Both are different
        }

        if (name1.equals(name3))
            logger.info("Both are same");           // Both are same

        if (name3 == name4) {
            logger.info("Both are same");
        } else {
            logger.info("Both are different");      // Both are different
        }

        if (name3.equals(name4)) {
            logger.info("Both are same");           // Both are Same
        } else {
            logger.info("Both are different");      // Both are different
        }

    }
}
