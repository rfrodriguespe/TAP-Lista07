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
public class PainelThread extends Thread {
    
    private Tv tv;
    private Radio radio;
    private Ligar liga;
    
    

    @Override
    public void run() {
        
        synchronized(liga) 
        {
            liga.ligar(); 
        } 
        
    }
    
    
    
}
