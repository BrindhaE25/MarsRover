public class Grid {
    private int rowStart;
    private int rowEnd;
    private int columnStart;
    private int columnEnd;

    public Grid(int rowStart, int rowEnd, int columnStart, int columnEnd) {
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
        this.columnStart = columnStart;
        this.columnEnd = columnEnd;
    }

    public int getRowStart() {
        return rowStart;
    }

    public void setRowStart(int rowStart) {
        this.rowStart = rowStart;
    }

    public int getRowEnd() {
        return rowEnd;
    }

    public void setRowEnd(int rowEnd) {
        this.rowEnd = rowEnd;
    }

    public int getColumnStart() {
        return columnStart;
    }

    public void setColumnStart(int columnStart) {
        this.columnStart = columnStart;
    }

    public int getColumnEnd() {
        return columnEnd;
    }

    public void setColumnEnd(int columnEnd) {
        this.columnEnd = columnEnd;
    }
}
