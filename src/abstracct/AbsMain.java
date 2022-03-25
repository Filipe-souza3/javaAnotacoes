package abstracct;

public class AbsMain {
    public static void main(String args[]){

        Gerente ger = new Gerente();
        ger.setNome("gerente 1");
        ger.setCpf("123.123");
        ger.setSalario(3000.00);

        System.out.println("Nome "+ger.getNome());
        System.out.println("Cpf "+ger.getCpf());
        System.out.println("Salario "+ger.getSalario());
        System.out.println("Bonus "+ger.bonus(ger.getSalario()));

        System.out.println("\n");

        Atendente ate = new Atendente();
        ate.setNome("Atendente 1");
        ate.setCpf("222.222");
        ate.setSalario(1500.00);

        System.out.println("Nome "+ate.getNome());
        System.out.println("Cpf "+ate.getCpf());
        System.out.println("Salario "+ate.getSalario());
        System.out.println("Bonus "+ate.getSalario());
        System.out.println(ate.bonus(ate.getSalario()));
    }
}
