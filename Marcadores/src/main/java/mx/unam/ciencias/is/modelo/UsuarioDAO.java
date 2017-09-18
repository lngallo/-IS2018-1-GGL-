/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

/**
 *
 * @author lgallo
 */
public class UsuarioDAO {
    
    public Usuario getUsuario(String correo) {
        Usuario salida = null;
        Session session = SessionFactory.OpenSession();
        Transaction tx = null;
        try {
            tx = Session.beginTransaction();
            /* Después del from nos referimos a la clase y correo es el atributo de la clase */
            String hql = "FROM Usuario WHERE correo =: c"; //inyectamos corre en c
            Query query = Session.createQuery(hql);
            query.setParameter("c", correo);
            salida = (Usuario)query.uniqueResult();
            tx.commint();
        }
    }
}
