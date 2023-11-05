package main;

import java.util.ArrayList;

import objects.Cuenco;
import objects.Participante;

public class Main {
    public static void main(String[] args){
        
        ArrayList <Participante> participantes = new ArrayList<Participante>();
        Cuenco cuenco = new Cuenco(10 );
        int numeroParticipantes = 3;

        for(int i = 0;i<numeroParticipantes;i++){
            Participante p = new Participante(i+1, cuenco);
            participantes.add(p);
            p.start();
           
        }
            try {

                 for(Participante p : participantes){
                    p.join();
                    
                 }
                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
           System.out.println("el juego ha terminado");
    }

   
}
