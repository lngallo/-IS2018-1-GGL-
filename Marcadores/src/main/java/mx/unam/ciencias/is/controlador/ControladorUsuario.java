/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import java.security.Principal;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.mapeobd.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author lgallo
 */
@Controller //Notación para spring
public class ControladorUsuario {
    /*Injectamos el modelo del marcador */
    @Autowired
    private UsuarioDAO usuario_db;
    
    /**
     * 
     * @param request
     * @return 
     */
    @RequestMapping(value="/agregaUsuario")
    public String guardarUsuario(HttpServletRequest request) {
        //DECLARAMOS ATRIBUTOS DE LA TABLA
        String nickname = request.getParameter("nickname");//*
        String correo = request.getParameter("correo");//*
        String contrasena = request.getParameter("contrasena");
        Usuario usuario = usuario_db.getUsuario(correo);
        Usuario nuevo_usuario;
        //Si no esta en la base creamos un usuario nuevo
        if (usuario == null){
            nuevo_usuario = new Usuario();
            nuevo_usuario.setNickname(nickname);
            nuevo_usuario.setCorreo(correo);
            nuevo_usuario.setContrasena(contrasena);
            usuario_db.guardar(nuevo_usuario);
        } else {
            //Mandar un mensaje de que el correo ya esta en uso
            //por un usuario registrado previamente
        }
        return "redirect:/";
    }
    
    /**
     * Ejemplo de petición con el objetivo de que creemos su vista
     * incuir el jsp y css
     * @return devolvemos la cadena con el nombre de la vista
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)//Se hace la peticion desde la raíz
    public String nuevoInicio() {
        return "nuevoInicio"; 
    }
}
