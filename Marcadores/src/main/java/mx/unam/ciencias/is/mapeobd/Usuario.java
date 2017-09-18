/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.mapeobd;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lgallo
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private int idusuario;
    
    @Column(name = "nickname")
    private String nickname;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "contrasena")
    private String contrasena;

    @OneToMany(mappedBy = "usuario")
    private Set<Marcador> marcadores;

    /**
     * 
     * @return 
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * 
     * @param idusuario 
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * 
     * @return 
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname 
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 
     * @return 
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * 
     * @return 
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * 
     * @param contrasena 
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * 
     * @return 
     */
    public Set getMarcadores() {
        return marcadores;
    }

    /**
     * 
     * @param marcadores 
     */
    public void setMarcadores(Set marcadores) {
        this.marcadores = marcadores;
    }
    
    
}
