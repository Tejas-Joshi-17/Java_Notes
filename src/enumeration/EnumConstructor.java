package enumeration;

import java.util.logging.Level;
import java.util.logging.Logger;

enum PaymentStatus {
    SUCCESS(200),
    FAILED(500),
    PENDING(102);

    // Internally
    // public static final PaymentStatus SUCCESS = new PaymentStatus("SUCCESS", 0, 200);
    // public static final PaymentStatus FAILED = new PaymentStatus("FAILED", 1, 500);
    // public static final PaymentStatus PENDING = new PaymentStatus("PENDING", 2, 102);

    private int code;

    PaymentStatus(int code) {
        this.code = code;
    }

    // Implicitly
    // private PaymentStatus(String name, int ordinal, int code) {
    //     super(name, ordinal);
    //     this.code = code;
    // }

    public int getCode() {
        return code;
    }
}

public class EnumConstructor {

    protected static final Logger logger = Logger.getLogger(EnumConstructor.class.getName());

    public static void main(String[] args) {

        PaymentStatus status = PaymentStatus.SUCCESS;

        logger.log( Level.INFO, "Status :- {0}", status);             // SUCCESS
        logger.log( Level.INFO, "Code :- {0}", status.getCode());     // 200
    }

}
