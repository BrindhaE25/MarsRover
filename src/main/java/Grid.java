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

    public boolean isRoverMovedOffTheEdge(Coordinate coordinate) {
        return !(coordinate.getX() >= LOWER_LEFT_COORDINATE && coordinate.getX() <= LOWER_RIGHT_COORDINATE &&
                coordinate.getY() >= LOWER_LEFT_COORDINATE && coordinate.getY() <= UPPER_LEFT_COORDINATE);

    }
}
