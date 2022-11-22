package cl.malapractica.main;

import cl.malapractica.entidades.Persona;
import java.util.Date;

/**
 *
 * @author malapractica
 * @date   2022-11-22
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciamos la clase Persona
        Persona persona = new Persona();
        //Llenamos los mutadores de la clase
        persona.setDni("12345678-2");
        persona.setPrimerNombre("John");
        persona.setSegundoNombre("");
        persona.setPrimerApellido("Doe");
        persona.setEdad(34);
        persona.setFechaNacimiento(new Date());
        
        //Llamamos al método toString().
        System.out.println(persona.toString());
    }
    
}
