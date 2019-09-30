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
public class Radio extends Eletrodomestico {
    private int estacao;
    private int volume;
    private boolean portatil;

    public Radio(int estacao, int volume, boolean portatil, int tensao, int consumo, boolean ligado) {
        super(tensao, consumo, ligado);
        this.estacao = estacao;
        this.volume = volume;
        this.portatil = portatil;
    }
    
    

    public int getEstacao() {
        return estacao;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }
    
    
}
