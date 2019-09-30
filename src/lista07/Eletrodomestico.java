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
public class Eletrodomestico {
    
    private int tensao;
    private int consumo;
    private boolean ligado;

    public Eletrodomestico(int tensao, int consumo, boolean ligado) {
        this.tensao = tensao;
        this.consumo = consumo;
        this.ligado = ligado;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    
}
