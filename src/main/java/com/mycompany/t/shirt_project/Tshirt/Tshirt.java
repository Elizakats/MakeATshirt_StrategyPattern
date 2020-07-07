/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.Tshirt;

import com.mycompany.t.shirt_project.enums.Color;
import com.mycompany.t.shirt_project.enums.Fabric;
import com.mycompany.t.shirt_project.enums.Size;

/**
 *
 * @author ELIZA
 */
public class Tshirt {

    private Color color;
    private Fabric fabric;
    private Size size;

    public Tshirt(Color color, Fabric fabric, Size size) {
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        
        
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
