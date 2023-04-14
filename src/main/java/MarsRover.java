public class MarsRover {
    private Position position;
    CommandFactory commandFactory = new CommandFactory();

    public MarsRover() {}

    public MarsRover(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(String[] initialPosition) {
        Coordinate coordinate = new Coordinate(Integer.parseInt(initialPosition[0]), Integer.parseInt(initialPosition[1]));
        Direction direction = getDirection(initialPosition[2]);
        this.position = new Position(coordinate, direction);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    private Direction getDirection(String position) {
        Direction direction = null;
        try {
            direction = Direction.getDirection(position);


        } catch (IllegalArgumentException exception) {
            System.out.println("Direction not found");
        }
        return direction;
    }

    private Position move(Command roverCommand) {
         return roverCommand.move(this.position);
    }

    public Position move(String command) {
        RoverCommand moveRoverCommand = getCommand(command);
        Command executeCommand = commandFactory.move(moveRoverCommand);
        return move(executeCommand);
    }

    private RoverCommand getCommand(String command) {
        RoverCommand moveRoverCommand = null;
        try {
            moveRoverCommand = RoverCommand.getCommand(command);


        } catch (IllegalArgumentException exception) {
            System.out.println("Command not found");
        }
        return moveRoverCommand;
    }
}
