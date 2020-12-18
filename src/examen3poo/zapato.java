/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3poo;

import java.io.File;

/**
 *
 * @author User
 */
public abstract class zapato {
    
    private int talla;
    private String color;
    private int tipo;
    String tipoEstilo;

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoEstilo() {
        return tipoEstilo;
    }

    public void setTipoEstilo(String tipoEstilo) {
        this.tipoEstilo = tipoEstilo;
    }
    
    
    public void calzar(){
        if (getTipo() == 1) setTipoEstilo("Dama");
        else if (getTipo() == 2) setTipoEstilo("Caballero");
        else setTipoEstilo("Niños");
        
        System.out.println( "\nQue bien me queda estos zapatos de " + getTipoEstilo() + " que son talla " + getTalla() + "\n\n");
    }
    
    public abstract void g2file(File archivo, zapato t);
    
}
