import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftCommandTest {

    @Test
    void shouldReturnDirectionAsWestWhenTheInitialDirectionIsLeft() {
        Coordinate coordinate = new Coordinate(1,1);
        Position position = new Position(coordinate, Direction.N);
        LeftCommand leftCommand = new LeftCommand();

        Position expected = leftCommand.move(position);

        assertEquals(Direction.W, expected.getDirection());
    }
}
