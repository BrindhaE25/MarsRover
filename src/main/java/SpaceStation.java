import java.util.Scanner;

public class SpaceStation {
    public static final String STOP_VALUE = "1";
    Grid grid;

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while (start) {
            System.out.println("Please enter the coordinates");
            Grid grid = getGridPosition(scanner);
            System.out.println("Enter the initial position");
            String[] initialPosition = scanner.nextLine().split(" ");
            MarsRover marsRover = new MarsRover();
            marsRover.setPosition(initialPosition);
            System.out.println("Enter the commands");
            String[] commands = scanner.nextLine().split("");
            String result;
            result = moveRover(marsRover, commands, grid);
            System.out.println("OUTPUT : " + result);
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
            Position position = marsRover.move(command);
            if (!isPositionValid(marsRover, position, grid)) {
                result = getPosition(marsRover) + " RIP";
                return result;
            }
        }
        return getPosition(marsRover);
    }

    private static boolean isPositionValid(MarsRover marsRover, Position position, Grid grid) {
        if (isRoverInsideGrid(position.getCoordinates(), grid)) {
            marsRover.setPosition(position);
            return true;
        } else
            return false;

    }

    private static boolean isRoverInsideGrid(Coordinate coordinate, Grid grid) {
        return coordinate.getX() >= grid.getLowerLeftCoordinate() && coordinate.getX() <= grid.getLowerRightCoordinate() &&
                coordinate.getY() >= grid.getLowerLeftCoordinate() && coordinate.getY() <= grid.getUpperLeftCoordinate();
    }

    private static Grid getGridPosition(Scanner scanner) {
        String[] gridPosition = scanner.nextLine().split(" ");
        return new Grid(Integer.parseInt(gridPosition[0]), Integer.parseInt(gridPosition[1]));
    }

}
