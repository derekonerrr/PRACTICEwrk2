package pr6.task01;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (x1 >= x2 || y1 <= y2)
            throw new IllegalArgumentException("Некорректные координаты: верхняя левая и нижняя правая точки перепутаны");
    }

    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    // Название SpeedTest оставлено в соответствии с формулировкой задания.
    public boolean SpeedTest() { return speedTest(); }

    private void checkSpeed() {
        if (!speedTest()) throw new IllegalStateException("Скорости точек прямоугольника различаются");
    }

    @Override public void moveUp() { checkSpeed(); topLeft.moveUp(); bottomRight.moveUp(); }
    @Override public void moveDown() { checkSpeed(); topLeft.moveDown(); bottomRight.moveDown(); }
    @Override public void moveLeft() { checkSpeed(); topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override public void moveRight() { checkSpeed(); topLeft.moveRight(); bottomRight.moveRight(); }

    @Override public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }
}
