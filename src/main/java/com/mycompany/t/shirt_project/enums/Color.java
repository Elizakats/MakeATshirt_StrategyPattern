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
public enum Color {
    RED(5),
    ORANGE(5),
    YELLOW(5),
    GREEN(5),
    BLUE(5),
    INDIGO(6),
    VIOLET(6);

    public int i;

    private Color(int i) {
        this.i = i;
    }

}
