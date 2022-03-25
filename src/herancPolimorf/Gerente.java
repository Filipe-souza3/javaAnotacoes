package herancPolimorf;

public class Gerente extends Funcionario{
    protected int senha;
    protected int numFuncGerenciados;

    

    public Gerente() {
    }

    
    public double getBonificacao(){
        return this.salario*0.15;
        // return super.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }

    

    
}
