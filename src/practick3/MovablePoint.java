package practick3;

public class MovablePoint implements Movable {
    int x = 0;
    int y = 0;
    int xSpeed = 0;
    int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + '}';
    }

    @Override
    public void moveUp() {
       System.out.println(y += ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(y -= ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(x -= xSpeed);
    }

    @Override
    public void moveRigth() {
        System.out.println(x += xSpeed);
    }
}
