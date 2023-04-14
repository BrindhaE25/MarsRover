import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DirectionTest {

    @Test
    void shouldReturnStepAs1WhenTheDirectionIsNorth() {
        Direction direction = Direction.N;

        int expectedValue = direction.getStep();

        assertEquals(1,expectedValue);
    }

    @Test
    void shouldReturnDirectionAsNorthWhenTheCommandSendIsN() {
        Direction direction = Direction.getDirection("N");

        assertEquals(Direction.N, direction);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTheDirectionIsNotFound() {
        assertThrows(IllegalArgumentException.class, () -> {Direction.getDirection("F");});
    }
}
