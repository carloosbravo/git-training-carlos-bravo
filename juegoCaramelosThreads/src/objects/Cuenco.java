package objects;

public class Cuenco {
    private int caramelos;
    
    
    public Cuenco( int caramelos){
        this.caramelos = caramelos;

    }

    public synchronized boolean cogerCaramelo(){
       if(caramelos>0){
            caramelos--;
            return true;
       }
       return false;
        
    }

    public int getCaramelos() {
        return caramelos;
    }

    public void setCaramelos(int caramelos) {
        this.caramelos = caramelos;
    }

    
}
