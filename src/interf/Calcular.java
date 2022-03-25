package interf;

import interf.interfac.IntefCalc;

public class Calcular {
    private IntefCalc ic;

    public Calcular(IntefCalc ic){
        this.ic = ic;
    }

    public int getCalcular(int num){
        return ic.calc(num);
    }
}
