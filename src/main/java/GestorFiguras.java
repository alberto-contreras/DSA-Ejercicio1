import java.util.Arrays;
public interface GestorFiguras {

    public static double suma (Figura [] l) {

            double ret=0;
            for (Figura f : l){
                ret+=f.area();
            }
            return ret;
    }

    public static void sort (Figura[] l) {
        Arrays.sort(l);//Metodo de una libreria de JAVA que ordena de mayor a menor
        System.out.println(Arrays.asList(l));
    }
}
