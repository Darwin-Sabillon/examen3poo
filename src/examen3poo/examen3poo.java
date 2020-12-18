/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3poo;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Darwin Sabillon
 */
public class examen3poo {

    public static void main(String[] args) {
        
        int cont = 1;
        Scanner r = new Scanner(System.in);
        int talla;
        String color;
        int tipo;
        ArrayList<zapato> elementos = new ArrayList<zapato>();
        zapato d;
        zapato c;
        zapato n;
        
        File archivo;
        PrintWriter escribir;
        archivo = new File("inventario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        while (cont != 0) {
            System.out.println("Desea agregar al inventario? \n"
                    + "Presione 1 para continuar\n"
                    + "Presione 0 para finalizar\n");
            cont = r.nextInt();
            
            if (cont != 0) {
                
                System.out.println("Que tipo de zapato desea agregar(presione el numero indice): \n"
                        + "1 - Dama\n"
                        + "2 - Caballero\n"
                        + "3 - Niños\n");
                tipo = r.nextInt();
                System.out.println("Ingrese la talla:");
                talla = r.nextInt();
                System.out.println("Ingrese el color:");
                color = r.next();
                
                switch (tipo) {
                    case 1:
                        d = new dama(talla, color, tipo);
                        elementos.add(d);
                        d.calzar();
                        d.g2file(archivo, d);
                        break;
                    case 2: 
                        c = new caballero(talla, color, tipo);
                        elementos.add(c);
                        c.calzar();
                        c.g2file(archivo, c);
                        break;
                    case 3:
                        n = new ninos(talla, color, tipo);
                        elementos.add(n);
                        n.calzar();
                        n.g2file(archivo, n);
                        break;
                }
                
            }
        }
    }
    
}
