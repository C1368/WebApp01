/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.hanbell.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author C1368
 */
@Named(value = "jSFManagedBean1")
@SessionScoped
public class JSFManagedBean1 implements Serializable {

    /**
     * Creates a new instance of JSFManagedBean1
     */
    public JSFManagedBean1() {
    }
    
}
