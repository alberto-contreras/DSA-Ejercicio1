import java.util.Arrays;

public class GestorFigurasImpl implements GestorFiguras{

    public static void main (String[]args) {
        Figura r = new Rectangulo(10,15);
        Figura t = new Triangulo(15,10);
        Figura q = new Quadrado(10);
        Figura  vectorfiguras [] = new Figura[3];
        vectorfiguras[0]=r;
        vectorfiguras[1]=t;
        vectorfiguras[2]=q;
        double areatotal;
        areatotal = GestorFiguras.suma(vectorfiguras);
        System.out.println("El area total de la suma de las figuras es " +areatotal);
        //GestorFiguras.sort(vectorfiguras);



    }
}



