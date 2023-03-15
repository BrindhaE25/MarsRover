import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {

    @Test
    void shouldReturnRowStartPointAs0WhenTheGridStartingPositionIs0and0() {
        Grid grid = new Grid(0, 5, 0, 5);

        Assertions.assertEquals(0, grid.getRowStart());
    }

    @Test
    void shouldReturnRowEndPointAs5WhenTheGridEndingPositionIs5and0() {
        Grid grid = new Grid(0, 5, 0, 5);

        Assertions.assertEquals(5, grid.getRowEnd());
    }

    @Test
    void shouldReturnColumnStartPointAs0WhenTheGridStartingPositionIs0and0() {
        Grid grid = new Grid(0, 5, 0, 5);

        Assertions.assertEquals(0, grid.getColumnStart());
    }

    @Test
    void shouldReturnColumnEndPointAs5WhenTheGridEndingPositionIs5and0() {
        Grid grid = new Grid(0, 5, 0, 5);

        Assertions.assertEquals(5, grid.getColumnEnd());
    }
}
