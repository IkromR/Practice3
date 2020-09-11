package practick3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void speedCheck(int xSpeed, int ySpeed) {
        if (xSpeed == ySpeed) {
            System.out.println("That's true!");
        } else
            System.out.println("That's not true");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "Top Left = "+this.topLeft +", Bottom Right = " + this.bottomRight+ '}';
    }

    @Override
    public void moveUp() {
        System.out.println(topLeft.y += topLeft.ySpeed);
        System.out.println((bottomRight.y += bottomRight.ySpeed) + "\n");
    }

    @Override
    public void moveDown() {
        System.out.println(topLeft.y -= topLeft.ySpeed);
        System.out.println((bottomRight.y -= bottomRight.ySpeed) + "\n");
    }

    @Override
    public void moveLeft() {
        System.out.println(topLeft.x -= topLeft.xSpeed);
        System.out.println((bottomRight.x -= bottomRight.xSpeed) + "\n");
    }

    @Override
    public void moveRigth() {
        System.out.println(topLeft.x += topLeft.xSpeed);
        System.out.println(bottomRight.x += bottomRight.xSpeed);
    }

}
