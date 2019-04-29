/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean.connection.dao;

import javax.persistence.EntityManager;
import model.bean.Ator;
import model.bean.connection.ConnectionFactory;

/**
 *
 * @author renat
 */
public class AtorDAO {
    
    public Ator salvar (Ator ator){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            if (ator.getId_ator() == null){
                em.getTransaction().begin();
                em.persist(ator);
                em.getTransaction().commit();
            }else{
                em.merge(ator);
            }
            
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
            
        } finally{
            em.close();
        }
        return ator;
    }
    
}
