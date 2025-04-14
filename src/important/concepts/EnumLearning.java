// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

import org.apache.commons.lang3.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EnumLearning {

    private static final Logger logger = Logger.getLogger(EnumLearning.class.getName());
    static final String PRINTING = "Today is :- {0}";

    public static void main(String[] args) {
        logger.log(Level.INFO, PRINTING, Days.SUNDAY);
        logger.log(Level.INFO, PRINTING, Days.TUESDAY);
        logger.log(Level.INFO, PRINTING, Days.SATURDAY);

        Days monday = Days.MONDAY;
        int ordinal = monday.ordinal();
        System.out.printf("Day is :- %s & Ordinal is :- %d", monday, ordinal);
        // Day is :- MONDAY & Ordinal is :- 1

        Days day1 = Days.valueOf("FRIDAY");
        logger.log(Level.INFO, "Day is :- {0}", day1);
        // Day is :- FRIDAY

        // Days day2 = Days.valueOf("friday");
        // logger.log(Level.INFO, "Day is :- {0}", day2);
        // No enum constant important.concepts.Days.friday


        /**
         * values() :-  Gives List of Constants
         */
        Days[] listOfDays = Days.values();
        for(Days day : listOfDays) {
            logger.log(Level.INFO, "Day is :- {0}", day.name());
        }
        // Day is :- SUNDAY
        // Day is :- MONDAY
        // Day is :- TUESDAY
        // Day is :- WEDNESDAY
        // Day is :- THURSDAY
        // Day is :- FRIDAY
        // Day is :- SATURDAY

        Days saturday = Days.SATURDAY;
        logger.log(Level.INFO, "{0}", saturday.displayDay());
        // Today is :- SATURDAY

        Days wednesday = Days.WEDNESDAY;
        logger.log(Level.INFO, "shortName is :- {0}", wednesday.getShortName());
        logger.log(Level.INFO, "Name is :- {0}", wednesday.name());
        logger.log(Level.INFO, "Ordinal is :- {0}", wednesday.ordinal());
        // shortName is :- Wed
        // Name is :- WEDNESDAY
        // Ordinal is :- 3

        /**
         * Enum with Switch Case
         */
        Days tuesday = Days.TUESDAY;
        switch (tuesday) {
            case MONDAY -> logger.info("Today is Monday");
            case TUESDAY -> logger.info("Today is Tuesday");
            case FRIDAY -> logger.info("Today is Friday");
            default -> logger.info("This is not Day");
        }
        // Today is Tuesday


        String todayDay = switch (tuesday) {
            case MONDAY -> "MONDAY";
            case TUESDAY -> "TUESDAY";
            case WEDNESDAY -> "WEDNESDAY";
            case THURSDAY -> "THURSDAY";
            case FRIDAY -> "FRIDAY";
            case SATURDAY -> "SATURDAY";
            case SUNDAY -> "SUNDAY";
        };

        logger.log(Level.INFO, "Today's Day is :- {0}", todayDay);
        // Today's Day is :- TUESDAY

        StringUtils.equals("name", "name");

    }
}

// ------------------------------------------------------------------------------------------------------------------------------------