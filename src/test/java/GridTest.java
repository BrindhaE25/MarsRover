import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {

    @Test
    void shouldReturnFalseWhenTheCoordinateIsInsideTheGrid() {
        Coordinate coordinate = new Coordinate(2,3);
        Grid grid = new Grid(5,5);

        Assertions.assertFalse(grid.isRoverMovedOffTheEdge(coordinate));
    }
}
