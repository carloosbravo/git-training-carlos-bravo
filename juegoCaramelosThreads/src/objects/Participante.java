package objects;

public class Participante extends Thread {

    private int id;
    private int cestaCaramelos;
    private Cuenco cuenco;

    public Participante(int id, Cuenco cuenco) {
        this.id = id;
        this.cuenco = cuenco;

    }

    public void run() {

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
