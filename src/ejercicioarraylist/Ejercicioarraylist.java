/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Ejercicioarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo e =new Equipo("Lel");
        Jugador f = new Jugador("fer");
        e.addJugador(f);
        ArrayList<Jugador> lista= e.getJugadores();
        for (Jugador jugador:lista) {
            System.out.println(jugador.getNombre());
        }
        for (int i = 0; i < lista.size(); i++) {
            Jugador jugador = lista.get(i);
            System.out.println(jugador.getNombre());
        }
    }
    
}
