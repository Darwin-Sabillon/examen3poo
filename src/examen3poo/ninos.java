/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3poo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ninos extends zapato {
    
    public ninos(int talla, String color, int tipo) {
        setTalla(talla);
        setColor(color);
        setTipo(tipo);
    }
    
    @Override
    public void g2file(File archivo, zapato t) {
        try {
            PrintWriter escribir;
            String texto = "Estilo: " + t.getTipoEstilo() + "\nColor: " + t.getColor() + "\nTalla: " + t.getTalla() + "\n\n";
            escribir = new PrintWriter(new FileOutputStream(archivo, true));
            escribir.write(texto);
            escribir.close();
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
    }
    
}
