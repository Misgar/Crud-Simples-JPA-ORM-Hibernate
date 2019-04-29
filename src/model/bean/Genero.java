/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author renat
 */
@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Genero;
    private String Genero;

    public Integer getId_Genero() {
        return Id_Genero;
    }

    public void setId_Genero(Integer Id_Genero) {
        this.Id_Genero = Id_Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
