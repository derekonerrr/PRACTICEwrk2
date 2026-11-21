package pr6.task01;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 2);
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 3);
        MovableRectangle rectangle = new MovableRectangle(0, 10, 5, 0, 2, 2);

        point.moveRight(); point.moveUp();
        circle.moveLeft(); circle.moveDown();
        rectangle.moveRight(); rectangle.moveUp();

        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println("Одинаковая скорость точек: " + rectangle.SpeedTest());
    }
}
