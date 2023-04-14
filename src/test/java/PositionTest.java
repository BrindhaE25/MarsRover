import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    @Test
    void shouldReturnPositionAs00NWhenXAndYIs0And0AndDirectionIsN() {
        Coordinate coordinate = new Coordinate(0,0);
        Position position = new Position(coordinate, Direction.N);
        Coordinate expectedCoordinate = new Coordinate(0,0);

        assertEquals(expectedCoordinate,position.getCoordinates());
        assertEquals(Direction.N,position.getDirection());
    }

    @Test
    void shouldReturnTrueWhenBothThePositionsAreSame() {
        Coordinate coordinate = new Coordinate(1,1);
        Position position = new Position(coordinate,Direction.N);
        Position anotherPosition = new Position(coordinate,Direction.N);

        boolean expected = position.equals(anotherPosition);

        assertTrue(expected);
    }
}
