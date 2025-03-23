package enumeration;

import java.util.logging.Logger;

public class EnumInSwitchStatement {

    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }

    protected static final Logger logger = Logger.getLogger(EnumPropertyImplementation.class.getName());

    public static void main(String[] args) {

        Color color = Color.BLUE;

        switch (color) {
            case RED:
                logger.info("Red color observed");
                break;
            case GREEN:
                logger.info("Green color observed");
                break;
            case BLUE:
                logger.info("Blue color observed");
                break;
            default:
                logger.info("Other color observed");
        }
        // Blue color observed

    }
}