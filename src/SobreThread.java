public class SobreThread {

    public static class Programa implements Runnable {

        private int id;        
        // colocar getter e setter pro atributo id

        public void run () {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Programa " + id + " valor: " + i);
            }
        }

        public Programa() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
    }

    public static void main(String[] args) {
        //sem static na classe interna
        // thread tr = new thread();
        // thread.Programa p1 = tr.new Programa();

        //com static na classe interna
        // thread.Programa p1 =new thread.Programa();
        
        SobreThread.Programa p1 =new SobreThread.Programa();

        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        Programa p2 = new SobreThread.Programa();   
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();             

    }
}