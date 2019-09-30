/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

/**
 *
 * @author rfrod
 */
public class Ligar {

    public void ligar() {
        System.out.println("Ligando os equipamentos");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread  interrompida.");
        }
        System.out.println("Equipamentos ligados.");
    }

}
