package interfDI.notas;

import interfDI.interfac.IntefCalc;

public class nota1 implements IntefCalc {

    @Override
    public int calc(int num){
        return num*2;
    }
}
