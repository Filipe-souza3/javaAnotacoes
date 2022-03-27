package factory.factory;

import factory.abstConcr.Homem;
import factory.abstConcr.Mulher;
import factory.abstConcr.Pessoa;

public class FactoryPessoa {
    
    public Pessoa getPessoa(String nome, String sexo){
        
        if(sexo.equals('F')){
            return new Mulher(nome);
        }else{
            return new Homem(nome);
        }
    }

}
