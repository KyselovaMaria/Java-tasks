class Point {
    int x;
    int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toPrint() {
        return "[" + x + "," + y + "]";
    }
    // Getter/Setters and other methods
}