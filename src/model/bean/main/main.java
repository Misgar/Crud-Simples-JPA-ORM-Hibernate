/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean.main;

import model.bean.Ator;
import model.bean.connection.dao.AtorDAO;


/**
 *
 * @author renat
 */
public class main {
    public static void main(String[] args) { 
        Ator renato = new Ator();
        AtorDAO atordao = new AtorDAO();
        
        renato.setNome_ator("Renato");
        
        atordao.salvar(renato);
        
        
    }
    
}
