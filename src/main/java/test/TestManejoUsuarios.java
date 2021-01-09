
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;


public class TestManejoUsuarios {
    public static void main(String[] Args){
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //CREACION DE PRIMER USUARIO
//        Usuario usuarioNuevo = new Usuario("Rony", "Porfis00");
//        usuarioDao.insertar(usuarioNuevo);

        Usuario usuarioNuevo = new Usuario("Irinea", "adis00");
        usuarioDao.insertar(usuarioNuevo);
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {System.out.println(usuario);});
    }
}
