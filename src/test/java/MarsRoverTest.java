import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    void shouldReturn2And3AndNAsPositionWhenTheInputSentIs2And3AndN() {
        MarsRover marsRover = new MarsRover();
        Coordinate coordinate = new Coordinate(2,3);
        Position position = new Position(coordinate,Direction.N);
        marsRover.setPosition(new String[]{"2","3","N"});

        assertEquals(position, marsRover.getPosition());
    }

    @Test
    void shouldReturnDirectionAsNullWhenTheInputSentIs2And3AndH() {
        MarsRover marsRover = new MarsRover();
        marsRover.setPosition(new String[]{"2","3","H"});

        assertNull(marsRover.getPosition().getDirection());
    }

    @Test
    void shouldReturnPositionAsWhenTheInitialPositionIsNAndCommandSentIsL() {
        MarsRover marsRover = new MarsRover();
        marsRover.setPosition(new String[]{"2","3","N"});

        Position position = marsRover.move("L");

        assertEquals(Direction.W,position.getDirection());
    }

    @Test
    void shouldReturnNullPointerExceptionWhenTheCommandSentIsH() {
        MarsRover marsRover = new MarsRover();
        marsRover.setPosition(new String[]{"2","3","N"});

        assertThrows(NullPointerException.class, () ->         marsRover.move("H"));
    }
}
