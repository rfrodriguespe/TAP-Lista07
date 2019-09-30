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
public class ExemploMensagens {

    public static void main(String args[]) {
        Enviar obj = new Enviar();
        EnviarThread S1 = new EnviarThread(" Olá ", obj);
        EnviarThread S2 = new EnviarThread(" Xau ", obj);

        S1.start();
        S2.start();

        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrompiada");
        }
    }

}
