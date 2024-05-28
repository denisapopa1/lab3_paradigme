//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(1.1f, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1f, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1f, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));
        System.out.println("Numarul de instante create: "+Form.getCounter());

        PasswordMaker passwordMaker=PasswordMaker.getInstance("DenisaP");
        String password=passwordMaker.getPassword();
        System.out.println("Parola generata: "+password);
    }
}
