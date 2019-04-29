/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author renat
 */
@Entity
public class Ator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ator;
    private String Nome_ator, Sexo, Dt_nascimento;
    @ManyToMany
    private List<Filme> filme; // com list permite vincular ator 1 com filme 1 mais de uma vez. Private Set faz com que o jpa nao permita isso.

    public List<Filme> getFilme() {
        return filme;
    }

    public void setFilme(List<Filme> filme) {
        this.filme = filme;
    }


    public Integer getId_ator() {
        return id_ator;
    }

    public void setId_ator(Integer id_ator) {
        this.id_ator = id_ator;
    }

    public String getNome_ator() {
        return Nome_ator;
    }

    public void setNome_ator(String Nome_ator) {
        this.Nome_ator = Nome_ator;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDt_nascimento() {
        return Dt_nascimento;
    }

    public void setDt_nascimento(String Dt_nascimento) {
        this.Dt_nascimento = Dt_nascimento;
    }
    
    
        
    
}
