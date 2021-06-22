package homeworks.homework_5.task_4;

public class AgeTooHighException extends Exception {
    public AgeTooHighException() {
    }

    public AgeTooHighException(String message) {
        super(message);
    }

    public AgeTooHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeTooHighException(Throwable cause) {
        super(cause);
    }

    public AgeTooHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
