/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Complejo {
    
    private int nReal;
    private int nImaginaria;

    public Complejo(int nReal, int nImaginaria) {
        this.nReal = nReal;
        this.nImaginaria = nImaginaria;
    }

    public int getNReal() {
        return nReal;
    }

    public void setNReal(int nReal) {
        this.nReal = nReal;
    }

    public int getNImaginaria() {
        return nImaginaria;
    }

    public void setNImaginaria(int nImaginaria) {
        this.nImaginaria = nImaginaria;
    }
    
    public Complejo operacion (Complejo c2, int op){
        Complejo c;
        int real=0, imaginario=0;
        
        switch(op){
            case 0:
                real=this.nReal+c2.nReal;
                imaginario=this.nImaginaria+c2.nImaginaria;
                break;
            case 1:
                real=this.nReal-c2.nReal;
                imaginario=this.nImaginaria-c2.nImaginaria;
                break;
            case 2:
                real=(this.nReal*c2.nReal)-(this.nImaginaria*c2.nImaginaria);
                imaginario=(this.nReal*c2.nImaginaria)+(this.nImaginaria*c2.nReal);
                break;
        }
        c = new Complejo(real,imaginario);
        return c;
    }
            
    public Complejo Division(Complejo c2){
        Complejo c;
        int n_Real, n_Imaginario;
        n_Real=(this.nReal*c2.nReal)+(this.nImaginaria*c2.nImaginaria);
        n_Imaginario=(this.nImaginaria*c2.nReal)-(this.nReal*c2.nImaginaria);
        c = new Complejo(n_Real, n_Imaginario);
        return c;
        
    } 
    
}
