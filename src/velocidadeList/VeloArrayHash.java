package velocidadeList;
import java.util.ArrayList;
import java.util.Collection;

public class VeloArrayHash {
    public static void main(String args[]){
        System.out.println("Iniciando...");

        //testando velocidade de busca e addicionamento na lista
        Collection<Integer> teste = new ArrayList<>();
        // Collection<Integer> teste = new HashSet<>();
        
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fim = System.currentTimeMillis();
        long inicio1 = System.currentTimeMillis();
        
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fim1 = System.currentTimeMillis();
        
        long tempo = fim - inicio;
        long tempo1 = fim1 - inicio1;
        System.out.println("Tempo gasto add: " + tempo);
        System.out.println("Tempo gasto: " + tempo1);

    }
}
