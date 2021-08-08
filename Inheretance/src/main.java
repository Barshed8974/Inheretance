public class main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++)
        {
            Rectangle rectangle=new Rectangle(i,i+2);
            rectangle.perimeter(i);
            rectangle.area(i);
            System.out.println();
            Square square=new Square(i,i);
            square.area(i);
            square.perimeter(i);
            System.out.println();
        }
    }
}
