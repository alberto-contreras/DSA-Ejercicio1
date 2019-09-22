public class Rectangulo extends Figura{

    private double l1;
    private double l2;

    public Rectangulo(double lado, double lado1) {
        l1 = lado;
        l2 = lado1;
    }

    public double area() {
        return l1*l2;
    }
}
