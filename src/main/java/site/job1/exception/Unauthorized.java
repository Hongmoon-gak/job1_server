package site.job1.exception;

/**
 * status -> 401
 */
public class Unauthorized extends Job1Exception {

    private static final String MESSAGE = "인증이 필요합니다.";

    public Unauthorized() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 401;
    }
}
