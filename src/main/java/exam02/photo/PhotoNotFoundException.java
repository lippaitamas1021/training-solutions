package exam02.photo;

public class PhotoNotFoundException extends RuntimeException {

    private String message;

    public PhotoNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
