
package test;
import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args){
        PersonaDAO personaDao = new PersonaDAO();
        
        
//INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA

    Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "0000000000");
    
    personaDao.insertar(personaNueva);
    
    List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> { System.out.println(persona); });


//         for(Persona persona: personas){
//            System.out.println(persona);
//        }

    }
}
