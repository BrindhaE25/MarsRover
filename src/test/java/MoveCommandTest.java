import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveCommandTest {

    @Test
    void shouldMoveRoverForwardOneStepWhenTheDirectionIsNorth() {
        Coordinate coordinate = new Coordinate(1,1);
        Position position = new Position(coordinate,Direction.N);
        MoveCommand moveCommand = new MoveCommand();

        Position newPosition = moveCommand.move(position);

        assertEquals(2,newPosition.getCoordinates().getY());
    }

    @Test
    void shouldMoveRoverBackwardOneStepWhenTheDirectionIsWest() {
        Coordinate coordinate = new Coordinate(2,2);
        Position position = new Position(coordinate,Direction.W);
        MoveCommand moveCommand = new MoveCommand();

        Position newPosition = moveCommand.move(position);

        assertEquals(1,newPosition.getCoordinates().getX());
    }
}
