/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.jsf.app;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Jcakl
 */
@ManagedBean(name = "navigationcontroller")
public class NavigationController {

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }
    
    public String moveToHelloPage() {
        return "newjsf";
    }
    
}
