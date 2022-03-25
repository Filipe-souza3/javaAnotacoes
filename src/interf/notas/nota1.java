package interf.notas;

import interf.interfac.IntefCalc;

public class nota1 implements IntefCalc {

    @Override
    public int calc(int num){
        return num*2;
    }
}
