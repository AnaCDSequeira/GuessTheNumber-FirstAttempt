public class Util {
    private static final int MAX_ELEMENT = 3;
    private static final int MIN_ELEMENT = 0;

    public static int generateNumber() {
        return (int) (Math.random() * (MAX_ELEMENT - MIN_ELEMENT + 1) + MIN_ELEMENT);
    }
}