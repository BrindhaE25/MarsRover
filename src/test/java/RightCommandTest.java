import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightCommandTest {

    @Test
    void shouldReturnEastAsDirectionWhenTheInitialPositionIsNorth() {
        Coordinate coordinate = new Coordinate(1,1);
        Position position = new Position(coordinate, Direction.N);
        RightCommand rightCommand = new RightCommand();

        Position expected = rightCommand.move(position);

        assertEquals(Direction.E, expected.getDirection());

    }
}
