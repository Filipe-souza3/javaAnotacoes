package factory;

import factory.factory.FactoryPessoa;

public class main {
    public static void main(String args[]){

        String nome1 = "maria";
        String sexo1 = "F";

        String nome2 = "Joao";
        String sexo2 = "M";

        FactoryPessoa fp =  new FactoryPessoa();
        fp.getPessoa(nome1, sexo1);
    }
}
