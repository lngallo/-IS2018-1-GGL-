/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

/**
 *
 * @author lgallo
 */
public class ControladorUsuario {
    
    public String guardarUsuario( request) {
        //DECLARAMOS ATRIBUTOS DE LA TABLA
          
        Usuario u usuario_bd.getUsuario(correo);
        if (u==nell){
            u = new Usuario();
            u.setNickname(nickname);
            u.setCorreo(correo);
            u.setContraseña(contrasena);
            usuario_bd.guardaUsuario(u);
        }
        return "redirect:/"
    }
}
