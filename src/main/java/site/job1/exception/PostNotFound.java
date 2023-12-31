package site.job1.exception;

/**
 * status -> 404
 */
public class PostNotFound extends Job1Exception {

    private static final String MESSAGE = "존재하지 않는 글입니다.";

    public PostNotFound() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }
}
