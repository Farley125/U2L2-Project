public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(150, 200);
        Rectangle b = new Rectangle(100);
        Rectangle c = new Rectangle();
        a.setWidth(125);
        b.setLength(125);
        b.setWidth(125);
        c.setWidth(125);
        int totalFencing = a.calculatePerimeter() + b.calculatePerimeter() + c.calculatePerimeter();
        System.out.println("You will need " + totalFencing + " feet of fencing.");
        int totalSeeding = a.calculateArea() + b.calculateArea() + c.calculateArea();
        System.out.println("You will need " + totalSeeding + " sq. feet of seeding.");

    }
}
