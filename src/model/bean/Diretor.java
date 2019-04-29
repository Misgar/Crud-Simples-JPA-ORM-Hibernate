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
public class Diretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_diretor;

    public Integer getId_diretor() {
        return Id_diretor;
    }

    public void setId_diretor(Integer Id_diretor) {
        this.Id_diretor = Id_diretor;
    }

    public String getNome_iretor() {
        return Nome_iretor;
    }

    public void setNome_iretor(String Nome_iretor) {
        this.Nome_iretor = Nome_iretor;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public String getDt_Nascimento() {
        return Dt_Nascimento;
    }

    public void setDt_Nascimento(String Dt_Nascimento) {
        this.Dt_Nascimento = Dt_Nascimento;
    }
    private String Nome_iretor, Nacionalidade, Dt_Nascimento;
}
