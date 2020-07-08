/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.enums;

/**
 *
 * @author ELIZA
 */
public enum Fabric {
    
    WOOL(6),
    COTTON(5),
    POLYESTER(3),
    RAYON(7),
    LINEN(8),
    CASHMERE(9),
    SILK(10);
    
     public int cost;

    private Fabric(int cost) {
        this.cost = cost;
    }
  
}
