package practick3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + this.radius + '}';
    }

    @Override
    public void moveUp() {
        System.out.println(center.y += center.ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(center.y -= center.ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(center.x -= center.xSpeed);
    }

    @Override
    public void moveRigth() {
        System.out.println(center.x += center.xSpeed);
    }
}
