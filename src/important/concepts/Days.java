// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

public enum Days {
    SUNDAY("Sun"),
    MONDAY("Mon"),
    TUESDAY("Tues"),
    WEDNESDAY("Wed"),
    THURSDAY("Thurs"),
    FRIDAY("Fri"),
    SATURDAY("Sut");

    private final String shortName;

    private Days(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String displayDay() {
        return "Today is :- " + this.name();
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------