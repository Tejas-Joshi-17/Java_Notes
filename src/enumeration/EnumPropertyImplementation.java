package enumeration;

import java.util.logging.Logger;

enum Day {
    SUNDAY,         // Implicitly 'public static final'
    MONDAY,         // Implicitly 'public static final'
    TUESDAY,        // Implicitly 'public static final'
    WEDNESDAY,      // Implicitly 'public static final'
    THURSDAY,       // Implicitly 'public static final'
    FRIDAY,         // Implicitly 'public static final'
    SATURDAY;       // Implicitly 'public static final'
}

public class EnumPropertyImplementation {

    protected static final Logger logger = Logger.getLogger(EnumPropertyImplementation.class.getName());

    Day day;

    public EnumPropertyImplementation(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                logger.info("Mondays are bad.");
                break;
            case FRIDAY:
                logger.info("Fridays are better.");
                break;
            case SUNDAY:
                logger.info("Weekends are best.");
                break;
            default:
                logger.info("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {

        EnumPropertyImplementation e = new EnumPropertyImplementation(Day.valueOf("MONDAY"));
        e.dayIsLike();          // Mondays are bad.

    }

}
