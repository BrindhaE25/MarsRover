import java.util.Scanner;

public class Grid {

    public static int LOWER_LEFT_COORDINATE;
    public static int UPPER_RIGHT_COORDINATE;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the coordinates");
        String[] gridPosition = scanner.nextLine().split(" ");
        LOWER_LEFT_COORDINATE = Integer.parseInt(gridPosition[0]);
        UPPER_RIGHT_COORDINATE = Integer.parseInt(gridPosition[1]);



    }

}
