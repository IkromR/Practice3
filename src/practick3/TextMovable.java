package practick3;

public class TextMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 1, 6, 6);
        System.out.println(m1);
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRigth();

        Movable m2 = new MovableCircle(1, 5, 7, 7, 6);
        System.out.println(m2);
        m2.moveUp();
        m2.moveDown();
        m2.moveLeft();
        m2.moveRigth();

        Movable m3 = new MovableRectangle(8, 5, 6, 4, 6, 8);
        System.out.println(m3);
        m3.moveUp();
        m3.moveDown();
        m3.moveLeft();
        m3.moveRigth();
    }
}
