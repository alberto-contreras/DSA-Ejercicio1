public abstract class Figura implements Comparable <Figura> {

    public Figura(){}
    public abstract double area(); //Cada Figura calcula su area de forma diferente


    public int compareTo(Figura f) { //No hace falta definirlo en cada clase ya que todas comparan igual
                                    //metodo compareTo es de JAVA
        return ((int)(this.area()-f.area()));
    }

    public String toString() { //Nos da el nombre de la del objeto y el area
        return this.getClass().getSimpleName()+" "+this.area();
    }
}
