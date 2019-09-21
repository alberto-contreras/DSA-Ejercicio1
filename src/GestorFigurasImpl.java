public class GestorFigurasImpl implements GestorFiguras{

    public static void main (String[]args) {
        Figura r = new Rectangulo(10,15);
        Figura t = new Triangulo(15,10);
        Figura  vectorfiguras [] = new Figura[2];
        vectorfiguras[0]=r;
        vectorfiguras[1]=t;
        double areatotal;
        areatotal = GestorFiguras.suma(vectorfiguras);
        System.out.println("El area total de la suma de las figuras es " +areatotal);



    }
}



