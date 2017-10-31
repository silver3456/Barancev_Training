package core;

public class MyFirstProgram {

    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Square " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 7);
        System.out.println("Rectangle " + r.a + " and " + r.b + " = " + r.area());

    }


}

