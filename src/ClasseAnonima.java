public class ClasseAnonima {
    public static class Programa implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<10000;i++){
                System.out.println("Programa 1 valor"+i);
            }             
        }
    }

    public static void main(String args[]){

        //sem classe anonima
        Runnable r = new Programa();
        Thread t =new Thread(r);
        t.start();


        //com classe anonima -- classes anonimas n pode declarar construtor
        Runnable ru = new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    System.out.println("Programa 2 valor"+i);
                }             
            } 
        };

        Thread th = new Thread(ru);
        th.start();

        
        //lambda
        Runnable rLambda =()->{
            for(int i=0;i<10000;i++){
                System.out.println("Programa 1 valor"+i);
            }             
        };

        Thread th2 = new Thread(rLambda);
        th2.start();

    }

}
