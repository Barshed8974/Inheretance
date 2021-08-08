public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void perimeter(int i)
    {
        System.out.println("Perimeter of "+i+"th"+" rectangle"+2*(length+breadth));
    }
    public void area(int i)
    {
        System.out.println("Area of "+i+"th"+" rectangle "+(length*breadth));
    }
}
