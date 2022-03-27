package herancPolimorf;

import java.io.PrintStream;

public class MainDep { 
 
    public static void main(String args[]){
        PrintStream ps = new PrintStream(System.out);
        
        //somente funcionario
        Funcionario f1 = new Funcionario();
        f1.setSalario(5000.0);
        ps.println("funcionario "+f1.getBonificacao());

        //gerente herda funcionario e reescreve bonificaçao
        Gerente g1 =new  Gerente();
        g1.setSalario(5000.0);
        ps.println("gerente "+g1.getBonificacao());


        Gerente g2 = new Gerente();
        Funcionario f2 = new Funcionario();
        f2 = g2;
        f2.setSalario(5000.0);
        ps.println("funcionario gerente "+f2.getBonificacao());

        //cb recebe como parametro funcionario onde tds q herdam ela entra
        ControleBonificacao cb = new ControleBonificacao();
        cb.registrar(f1);
        //aqui gerente entrou como funcionario
        cb.registrar(g1);
        //aqui f2 recebeu gerente
        cb.registrar(f2);
        ps.println("total bonificaçao "+cb.getTotalBonificacoes());

    }


    
}
