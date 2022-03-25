import java.io.PrintStream;

public class FinalClass {
    
    //classe com final nao pode ser herdada-- mas a classe com final pode herdar de alguem
    // public final class Testefinal{
    public class Testefinal{

        //na variavel o final so deixa ela ser instanciada apenas uma vez e ser usada somente com o contructor pois ele tbm so e instanciado uma vez
        // final int num;
        final int num;
        PrintStream  print = System.out;

        public Testefinal(){
           this.print.println(num=10); 
        }

        //no metrodo impede na herança de sobrescrever o metodo
        // public final void print(){
        public final void print(){
            this.print.println("testando classe final");
        }
    }

    
    // public class HerancaTesteFinal extends Testefinal{
    public class HerancaTesteFinal extends Testefinal{
        
    }


    public static void main(String args[]){
        FinalClass hf = new FinalClass();
        FinalClass.HerancaTesteFinal htf = hf.new HerancaTesteFinal();

        htf.print();

    }
}
