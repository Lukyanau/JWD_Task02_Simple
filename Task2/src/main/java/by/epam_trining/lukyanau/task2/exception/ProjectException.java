package by.epam_trining.lukyanau.task2.exception;

public class ProjectException extends Exception {
    public ProjectException() {
        super();
    }

    public ProjectException(String message) {
        super(message);
    }

    public ProjectException(Throwable cause) {
        super(cause);
    }

    public ProjectException(Throwable cause, String message) {
        super(message, cause);
    }
}
