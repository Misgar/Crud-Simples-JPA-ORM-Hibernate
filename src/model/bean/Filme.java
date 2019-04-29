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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author renat
 */
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Filme;
    private Integer Ano_lancamento, duracao;
    private String Nome_filme_PT, Nome_filme_EN;
 
    @ManyToMany (mappedBy = "filme")
    private List<Ator> ator;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Diretor diretor;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Genero genero;
    

    public Integer getId_Filme() {
        return Id_Filme;
    }

    public void setId_Filme(Integer Id_Filme) {
        this.Id_Filme = Id_Filme;
    }

    public List<Ator> getAtor() {
        return ator;
    }

    public void setAtor(List<Ator> ator) {
        this.ator = ator;
    }

    public Integer getAno_lancamento() {
        return Ano_lancamento;
    }

    public void setAno_lancamento(Integer Ano_lancamento) {
        this.Ano_lancamento = Ano_lancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getNome_filme_PT() {
        return Nome_filme_PT;
    }

    public void setNome_filme_PT(String Nome_filme_PT) {
        this.Nome_filme_PT = Nome_filme_PT;
    }

    public String getNome_filme_EN() {
        return Nome_filme_EN;
    }

    public void setNome_filme_EN(String Nome_filme_EN) {
        this.Nome_filme_EN = Nome_filme_EN;
    }

    
    
    
            
    
}
