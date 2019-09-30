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
public class EnviarThread extends Thread {
    
    private String mensagem; 
   // private Thread t; 
    Enviar  mensageiro; 
  
    EnviarThread(String m,  Enviar obj)
    { 
        mensagem = m; 
        mensageiro = obj;
    } 
  
    public void run() 
    { 
         
        synchronized(mensageiro) 
        {
            mensageiro.enviar(mensagem); 
        } 
    } 
    
}
