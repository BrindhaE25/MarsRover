public class MoveCommand implements Command {
    @Override
    public Position move(Position position) {
        Coordinate coordinate = position.getCoordinates();
        int xCoordinate = coordinate.getX();
        int yCoordinate = coordinate.getY();
        int moveStep = position.getDirection().getStep();
        Coordinate newCoordinate = null;
        int newCoordinates;

        switch (position.getDirection()) {
            case N, S -> {
                newCoordinates = yCoordinate + moveStep;
                newCoordinate = new Coordinate(xCoordinate, newCoordinates);
            }
            case E, W -> {
                newCoordinates = xCoordinate + moveStep;
                newCoordinate = new Coordinate(newCoordinates, yCoordinate);
            }
        }
        return new Position(newCoordinate, position.getDirection());
    }
}
