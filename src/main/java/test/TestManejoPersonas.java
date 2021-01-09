
package test;
import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args){
        PersonaDAO personaDao = new PersonaDAO();
        
        
//INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA

//    Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "0000000000");
//    
//    personaDao.insertar(personaNueva);

    //MODIFICAR UN REGISTRO 
//        Persona personaActualizar = new Persona(4 , "Irinea", "Franco", "ada_life@live.com", "3755-669636");
//    
//             personaDao.actualizar(personaActualizar);

    //ELIMINAR UN REGISTRO DE LA BASE DE DATOS
//          Persona eliminarPersona = new Persona(2);
//          personaDao.eliminar(eliminarPersona);

    //LISTADO DE PERSONAS
         List<Persona> personas = personaDao.seleccionar();
        
             personas.forEach(persona -> { System.out.println(persona); });


//         for(Persona persona: personas){
//            System.out.println(persona);
//        }

    }
}
