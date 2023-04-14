import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {

    @Test
    void shouldReturn5AsUpperRightCoordinateWhenInputSentIs5and5() {
        Grid grid = new Grid(5,5);

        Assertions.assertEquals(5,grid.getUpperRightCoordinate());
    }

    @Test
    void shouldReturn5AsUpperLeftCoordinateWhenInputSentIs5and5() {
        Grid grid = new Grid(5,5);

        Assertions.assertEquals(5,grid.getUpperLeftCoordinate());
    }

    @Test
    void shouldReturn5AsLowerRightCoordinateWhenInputSentIs5and5() {
        Grid grid = new Grid(5,5);

        Assertions.assertEquals(5,grid.getLowerRightCoordinate());
    }

    @Test
    void shouldReturn5AsLowerLeftCoordinateWhenInputSentIs5and5() {
        Grid grid = new Grid(5,5);

        Assertions.assertEquals(0,grid.getLowerLeftCoordinate());
    }
}
