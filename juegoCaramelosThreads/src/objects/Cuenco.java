package objects;

public class Cuenco {
    private int caramelos;
    
    
    public Cuenco( int caramelos){
        this.caramelos = caramelos;

    }

    public synchronized void cogerCaramelo(Participante p){
        caramelos--;
    }
}
