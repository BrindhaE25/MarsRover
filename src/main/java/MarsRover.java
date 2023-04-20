public class MarsRover {
    private Position position;
    CommandFactory commandFactory = new CommandFactory();

    public MarsRover(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position move(RoverCommand command, Grid grid) {
        Command executeCommand = commandFactory.move(command);
        Position position = executeCommand.move(this.position);
        if (!grid.isRoverMovedOffTheEdge(position.getCoordinates())) {
            this.position = position;
        }

        return position;
    }

}
