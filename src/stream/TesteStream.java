package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class TesteStream {
    
    public static void main(String Args[]){
        Cliente c1 = new Cliente("joao", true, "123", 5);
        Cliente c2 = new Cliente("maria", true, "456", 10);
        Cliente c3 = new Cliente("marcos", true, "241", 20);


        List<Cliente> clientes = Arrays.asList(c1,c2,c3);
        clientes.forEach(c->System.out.println(c.getPontos()));

        System.out.println("----------");

        Stream<Cliente> stream = clientes.stream().filter(c->c.getPontos()>5);
        stream.forEach(c->System.out.println(c.getPontos()));

        System.out.println("----------");

        Stream<Integer> stream1 = clientes.stream().map(c->c.getPontos());
        // IntStream stream1 = clientes.stream().mapToInt(c->c.getPontos());
        stream1.forEach(c->System.out.println(c));

        System.out.println("----------");

        

          
    }
}
