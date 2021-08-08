public class Square extends Rectangle{

    public Square(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area(int i) {
        System.out.println("Area of "+i+"th"+" Square "+ length*4);
    }

    @Override
    public void perimeter(int i) {
        System.out.println("Perimeter of "+i+"th"+" Square "+ length*length);
    }
}
