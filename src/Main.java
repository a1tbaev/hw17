public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(1,2,3);
        System.out.println("perimeter of triangle " + triangle.getPerimeter());

        Shape circle = new Circle(3);
        System.out.println("perimeter of circle "+circle.getPerimeter());

        Shape rectangle = new Rectangle(2,3,2,3);
        System.out.println("perimeter of rectangle "+ rectangle.getPerimeter());

        Shape pentagon = new Pentagon(1,2,3,4,5);
        System.out.println("perimeter of pentagon "+pentagon.getPerimeter());

        Shape square = new Square(3);
        System.out.println("perimeter of square "+square.getPerimeter());
    }
}