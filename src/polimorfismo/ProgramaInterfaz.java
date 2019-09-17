/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author LeidyA
 */
public class ProgramaInterfaz {

    public static void main(String arg[]) {
        
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);

        Canario piolin = new Canario();
        hacerCantar(piolin);
        
        Burro azno = new Burro();
        hacerCantar(azno);
    }

    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}
