import java.util.Scanner;

public class SpaceStation {
    public static final String STOP_VALUE = "1";

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while (start) {
            System.out.println("Please enter the coordinates");
            Grid grid = getGrid(scanner);
            System.out.println("Enter the initial position");
            String[] initialPosition = scanner.nextLine().split(" ");
            try {
                Coordinate coordinate = new Coordinate(Integer.parseInt(initialPosition[0]), Integer.parseInt(initialPosition[1]));
                Direction direction = Direction.getDirection(initialPosition[2]);
                Position position = new Position(coordinate, direction);
                MarsRover marsRover = new MarsRover(position);

                System.out.println("Enter the commands");
                String[] commands = scanner.nextLine().split("");
                String result;
                result = moveRover(marsRover, commands, grid);
                System.out.println("OUTPUT : " + result);
            } catch (IllegalArgumentException exception) {
                System.out.println("Direction not found");
            }
            System.out.println("Press 1 to stop");
            if (scanner.nextLine().equals(STOP_VALUE))
                start = false;
        }
    }


    public static String getPosition(MarsRover marsRover) {
        return marsRover.getPosition().getCoordinates().getX() + " " + marsRover.getPosition().getCoordinates().getY() + " " + marsRover.getPosition().getDirection();
    }

    public static String moveRover(MarsRover marsRover, String[] commands, Grid grid) {
        String result;
        for (String command : commands) {
            try {
                RoverCommand roverCommand = RoverCommand.getCommand(command);
                Position position = marsRover.move(roverCommand,grid);
                if(!position.equals(marsRover.getPosition())) {
                    result = getPosition(marsRover) + " RIP";
                    return result;
                }
            } catch (IllegalArgumentException exception) {
                throw new IllegalArgumentException();
            }
        }
        return getPosition(marsRover);
    }

    private static Grid getGrid(Scanner scanner) {
        String[] gridPosition = scanner.nextLine().split(" ");
        return new Grid(Integer.parseInt(gridPosition[0]), Integer.parseInt(gridPosition[1]));
    }

}
