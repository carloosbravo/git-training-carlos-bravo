package objects;

public class Participante extends Thread {
    
    private int id;
    private int cestaCaramelos;
    private Cuenco cuenco;

    public Participante( int id, Cuenco cuenco){
        this.id = id;
        this.cuenco = cuenco;

    }

    public  void run(){
            
    }
}
