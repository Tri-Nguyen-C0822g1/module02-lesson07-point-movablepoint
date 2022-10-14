public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(2,3);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(2,3,4,6);
        System.out.println(movablePoint2);
        System.out.println(movablePoint2.getMove());
    }
}
