/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brendev.shopapp.dao;


import com.brendev.shopapp.dao.core.BaseDaoBeanLocal;
import com.brendev.shopapp.entities.Profil;
import javax.ejb.Local;

/**
 *
 * @author NOAMESSI
 */
@Local
public interface ProfilDaoBeanLocal extends BaseDaoBeanLocal<Profil, Long>{
    
}
