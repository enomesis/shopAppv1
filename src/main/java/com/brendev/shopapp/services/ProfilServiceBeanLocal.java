/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brendev.shopapp.services;

import com.brendev.shopapp.entities.Profil;
import com.brendev.shopapp.services.core.BaseServiceBeanLocal;
import javax.ejb.Local;

/**
 *
 * @author NOAMESSI
 */
@Local
public interface ProfilServiceBeanLocal extends BaseServiceBeanLocal<Profil, Long>{
    
}
