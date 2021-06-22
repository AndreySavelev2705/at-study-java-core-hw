package homeworks.homework_5.task_4;

public class AgeUnderZeroException extends RuntimeException {
    public AgeUnderZeroException() {
    }

    public AgeUnderZeroException(String message) {
        super(message);
    }

    public AgeUnderZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeUnderZeroException(Throwable cause) {
        super(cause);
    }

    public AgeUnderZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
