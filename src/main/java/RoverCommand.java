import java.util.Arrays;

public enum RoverCommand {
    L, R, M;

    public static RoverCommand getCommand(String command) {
        if (!Arrays.stream(RoverCommand.values()).toList().contains(RoverCommand.valueOf(command)))
            throw new IllegalArgumentException();
        else

            return RoverCommand.valueOf(command);
    }
}
