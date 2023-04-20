import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    void shouldReturn2And3AndNAsPositionWhenTheInputSentIs2And3AndN() {
        Coordinate coordinate = new Coordinate(2,3);
        Position position = new Position(coordinate,Direction.N);
        MarsRover marsRover = new MarsRover(position);


        assertEquals(position, marsRover.getPosition());
    }


    @Test
    void shouldReturnPositionAsWhenTheInitialPositionIsNAndCommandSentIsL() {
        Position position = new Position(new Coordinate(2,3),Direction.N);
        MarsRover marsRover = new MarsRover(position);

        Position expectedPosition = marsRover.move(RoverCommand.L,new Grid(5,5));

        assertEquals(Direction.W,expectedPosition.getDirection());
    }
}
