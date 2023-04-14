import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpaceStationTest {

    @Test
    void shouldReturn13NAsFinalPositionWhenInitialPositionIs12NAndCommandsAreLMLMLMLMM() {
        Coordinate coordinate = new Coordinate(1,2);
        Position position = new Position(coordinate,Direction.N);
        MarsRover marsRover = new MarsRover(position);
        Grid grid = new Grid(5,5);
        String input[] = {"L","M","L","M","L","M","L","M","M"};

        String actualResult = SpaceStation.moveRover(marsRover,input,grid);

        Assertions.assertEquals("1 3 N", actualResult);
    }

    @Test
    void shouldReturn51ERIPAsFinalPositionWhenInitialPositionIs33ENAndCommandsAreMMRMMLMRRM() {
        Coordinate coordinate = new Coordinate(3,3);
        Position position = new Position(coordinate,Direction.E);
        MarsRover marsRover = new MarsRover(position);
        Grid grid = new Grid(5,5);
        String input[] = {"M","M","R","M","M","L","M","R","R","M"};

        String actualResult = SpaceStation.moveRover(marsRover,input,grid);

        Assertions.assertEquals("5 1 E RIP", actualResult);
    }
}
