package clonable;

public class Point implements Cloneable {

    int x;
    int y;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Point point = new Point();
        point.x = this.x;
        point.y = this.y;
        return point;
    }
}
