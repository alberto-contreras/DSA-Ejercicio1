import java.util.Arrays;
public interface GestorFiguras {

    static double suma (Figura [] l){

            double ret=0;
            for (Figura f : l){
                ret+=f.area();
            }
            return ret;


    }
     static  Figura[] sort (Figura[] l){
        Figura [] vector  = new Figura[2];
        //Arrays.sort(vector);
        return vector;

    }
}
