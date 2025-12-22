package backend.config;

public class ExceptionHandler extends RuntimeException {
    public ExceptionHandler(String message) {
        super(message);
    }
}
