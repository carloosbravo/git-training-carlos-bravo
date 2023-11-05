package objects;

public class Participante extends Thread {

    private int id;
    private int cestaCaramelos = 0;
    private Cuenco cuenco;

    public Participante(int id, Cuenco cuenco) {
        this.id = id;
        this.cuenco = cuenco;

    }

    public void run() {
            while (cuenco.cogerCaramelo()) {
                cestaCaramelos++;
                 cuenco.cogerCaramelo();
                 try {
                    Thread.sleep(100); // Simular tiempo que tarda el participante en tomar un caramelo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           
            System.out.println("El participante numero " +id+"tiene " +cestaCaramelos+" caramelos.");

    }
    public void tomarCaramelo(){

    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCestaCaramelos() {
        return cestaCaramelos;
    }

    public void setCestaCaramelos(int cestaCaramelos) {
        this.cestaCaramelos = cestaCaramelos;
    }

    public Cuenco getCuenco() {
        return cuenco;
    }

    public void setCuenco(Cuenco cuenco) {
        this.cuenco = cuenco;
    }

    
}
