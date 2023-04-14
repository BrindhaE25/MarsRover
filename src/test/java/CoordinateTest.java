import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void shouldReturnXas1andYas2WhenCoordinatesIs1And2() {
        Coordinate coordinate = new Coordinate(1,2);
        int actualX = coordinate.getX();
        int actualY = coordinate.getY();

        assertEquals(1,actualX);
        assertEquals(2,actualY);
    }

    @Test
    void shouldReturnTrueWhenBothTheCoordinatesAreSame() {
        Coordinate coordinate = new Coordinate(2,2);
        Coordinate anotherCoordinate = new Coordinate(2,2);

        boolean expectedValue = coordinate.equals(anotherCoordinate);

        assertTrue(expectedValue);
    }

    @Test
    void shouldReturnFalseWhenBothTheCoordinatesAreSame() {
        Coordinate coordinate = new Coordinate(1,2);
        Coordinate anotherCoordinate = new Coordinate(2,2);

        boolean expectedValue = coordinate.equals(anotherCoordinate);

        assertFalse(expectedValue);
    }
}
