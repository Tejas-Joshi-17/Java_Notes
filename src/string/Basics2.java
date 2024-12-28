package string;

import java.util.logging.Logger;

public class Basics2 {
    private static Logger logger = Logger.getLogger(Basics2.class.getName());

    public static void main(String[] args) {

        String name1 = "Rakesh";
        String name2 = "RaKEsh";
        String name3 = new String("Rakesh");
        String name4 = new String("Rakesh");

        if(name1.equals(name2)) {
            logger.info("Both are Same");
        } else {
            logger.info("Both are Different");          // Both are Different
        }

        if(name1.equalsIgnoreCase(name2)) {
            logger.info("Both are Same");               // Both are Same
        } else {
            logger.info("Both are Different");
        }

        String string = "Tejas Joshi";
    }
}
