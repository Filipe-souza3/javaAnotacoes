package abstracct;

public class Gerente extends FuncAbstract{

    private Double salario;

    public Gerente() {
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    

    @Override
    public Double bonus(Double sal) {
        return sal*0.1;
    }
    
}
