/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author armen
 */
@Stateless
@LocalBean
public class BackendSessionBean {

    public String businessMethod() {
        return "Java EE 8";        
    }

}
