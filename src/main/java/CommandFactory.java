public class CommandFactory {

    public Command move(RoverCommand command) {
        Command executeCommand;
        switch (command) {
            case L ->  executeCommand = new LeftCommand();
            case R -> executeCommand = new RightCommand();
            case M  -> executeCommand = new MoveCommand();
            default -> throw new IllegalStateException("Unexpected value: " + command);
        }
        return executeCommand;
    }
}
