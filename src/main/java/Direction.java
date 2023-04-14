import java.util.Arrays;

public enum Direction {
    N(1), E(1), S(-1), W(-1);

    private final int step;

    Direction(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public static Direction getDirection(String direction) {
            if (!Arrays.stream(Direction.values()).toList().contains(Direction.valueOf(direction)))
                throw new IllegalArgumentException();
            else

                return Direction.valueOf(direction);
        }
    }
