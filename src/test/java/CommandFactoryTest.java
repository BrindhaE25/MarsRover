import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandFactoryTest {

    @Test
    void shouldReturnLeftCommandObjectWhenTheCommandSentIsLeft() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.move(RoverCommand.L);

        assertEquals(command.getClass(), LeftCommand.class);
    }

    @Test
    void shouldReturnRightCommandObjectWhenTheCommandSentIsRight() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.move(RoverCommand.R);

        assertEquals(command.getClass(), RightCommand.class);
    }

    @Test
    void shouldReturnMoveCommandObjectWhenTheCommandSentIsMove() {
        CommandFactory commandFactory = new CommandFactory();

        Command command = commandFactory.move(RoverCommand.M);

        assertEquals(command.getClass(), MoveCommand.class);
    }
}
