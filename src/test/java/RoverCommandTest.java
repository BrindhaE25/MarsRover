import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverCommandTest {

    @Test
    void shouldReturnLeftWhenTheInputSentIsL() {
        RoverCommand roverCommand = RoverCommand.getCommand("L");

        assertEquals(RoverCommand.L, roverCommand);
    }

    @Test
    void shouldReturnIllegalArgumentExceptionWhenTheCommandIsF() {
        assertThrows(IllegalArgumentException.class,()-> RoverCommand.getCommand("F"));
    }
}
