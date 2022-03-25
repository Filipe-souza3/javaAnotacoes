package herancPolimorf;

public class ControleBonificacao {
    private double totalBonificacao = 0;

    public void registrar(Funcionario funcionario){
        this.totalBonificacao +=funcionario.getBonificacao();
    }

    public double getTotalBonificacoes(){
        return this.totalBonificacao;
    }

}
