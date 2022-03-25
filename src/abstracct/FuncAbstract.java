package abstracct;

public abstract class FuncAbstract {
    String nome;
    String cpf;


    public abstract Double bonus(Double sal);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
}
