public class Point {
    private int x;
    private int y;

    public Point(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void translate(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public void xShift(int num) {
        x += num;
    }
    public void yShift(int num) {
        y += num;
    }
}
