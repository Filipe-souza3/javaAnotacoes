package abstracct;

public class Atendente extends FuncAbstract{

    private Double salario;

    public Atendente() {
    }

    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    @Override
    public Double bonus(Double sal) {
        return sal*0.05;
    }
}
