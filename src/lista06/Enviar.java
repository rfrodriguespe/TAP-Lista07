/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

/**
 *
 * @author rfrod
 */
public class Enviar {

    public void enviar(String msg) {
        System.out.println("Enviando " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread  interrompida.");
        }
        System.out.println( msg + " enviada.");
    }

}
