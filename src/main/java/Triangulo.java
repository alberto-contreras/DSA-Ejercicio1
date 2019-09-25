public class Triangulo extends Figura {
    public Triangulo (double b,double h){
        base = b;
        altura = h;
    }
    private double base;
    private double altura;
    public double area() {
        double area;
        area=base*altura;
        return area/2;

    }
}
