public class Grid {
    private final int UPPER_LEFT_COORDINATE;
    private final int UPPER_RIGHT_COORDINATE;
    private final int LOWER_LEFT_COORDINATE = 0;
    private final int LOWER_RIGHT_COORDINATE;

    public Grid(int upperLeft, int upperRight) {
        LOWER_RIGHT_COORDINATE = upperRight;
        UPPER_RIGHT_COORDINATE = upperRight;
        UPPER_LEFT_COORDINATE = upperLeft;
    }

    public int getUpperLeftCoordinate() {
        return UPPER_LEFT_COORDINATE;
    }

    public int getUpperRightCoordinate() {
        return UPPER_RIGHT_COORDINATE;
    }

    public  int getLowerLeftCoordinate() {
        return LOWER_LEFT_COORDINATE;
    }

    public int getLowerRightCoordinate() {
        return LOWER_RIGHT_COORDINATE;
    }
}
