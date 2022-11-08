package banquemisr.irrigation.exception.custom;

public class LandNotFoundException extends RuntimeException {
    public LandNotFoundException(String message) {
        super(message);
    }
}
