public class Line {
    private Point pt1;
    private Point pt2;

    private Line(int x1, int y1, int x2, int y2) {
        pt1 = new Point(x1, y1);
        pt2 = new Point(x2, y2);
    }

    public Point getFirst() {
        return pt1;
    }
    public Point getSecond() {
        return pt2;
    }

    public double getLength() {
        //a^2 + b^2  = length
        return ( Math.pow(Math.pow((pt1.getX() - pt2.getX()), 2) + Math.pow((pt1.getY() - pt2.getY()), 2) , 1/2) );
    }
}
