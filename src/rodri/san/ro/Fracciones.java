package rodri.san.ro;

public class Fracciones {
    int numerador;
    int denominador;
    public Fracciones(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fracciones suma(Fracciones a){
         int cont1 = (a.numerador * this.denominador)+ (a.denominador * this.numerador);
         int cont2 = this.denominador * a.denominador;
         Fracciones f = new Fracciones(cont1, cont2) ;
         return f;
    }
    public void mostrar(){

    }
}
