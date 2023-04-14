public class RightCommand implements Command {
    public static final int ROTATE_NO_OF_COORDINATES = 1;

    @Override
    public Position move(Position position) {
        int positionIndex = (position.getDirection().ordinal() + ROTATE_NO_OF_COORDINATES);
        int totalDirections = Direction.values().length;
        Direction direction = Direction.values()[positionIndex % totalDirections];
        return new Position(position.getCoordinates(),direction);
    }
}
