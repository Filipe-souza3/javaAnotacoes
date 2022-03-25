package interf;

import interf.notas.nota1;
import interf.notas.nota2;

public class MainInterf {
    public static void main(String arg[]){


        Calcular calc = new Calcular(new nota2());
        int x = calc.getCalcular(5);
        
        System.out.println(x);
        // System.out.println(calc.print());
    }
}
