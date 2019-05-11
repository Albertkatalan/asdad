/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Albert Katalán
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int pa, Pt, Pg, Pp;
        System.out.println("proporciona el valor del presupuesto anual");
        pa = teclado.nextInt();
        Pg = pa/100*40;
        Pt = pa/100*30;
        Pp = pa/100*30;
        System.out.println("el presupuesto anual de ginecologia es de:"+Pg);
        System.out.println("el presupuesto anual de traumatologia es de:"+Pt);
        System.out.println("el presupuesto anual de pediatria es de:"+Pp);
    }
    
}
