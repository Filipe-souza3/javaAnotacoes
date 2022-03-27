package interfDI.notas;

import interfDI.interfac.IntefCalc;

public class nota2 implements IntefCalc{

    @Override
    public int calc(int num){
        return num*5;
    }

    public void print(){
        System.out.println("teste");
    }
}
