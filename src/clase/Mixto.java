/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import Excepciones.DenominadorCeroException;

/**
 *
 * @author adalberto
 */
public class Mixto {
    private int entero;
    private int numerador;
    private int denominador;
    
    
    public Mixto (int entero, int numerador, int denominador) throws DenominadorCeroException{
        if(denominador == 0){
            throw new DenominadorCeroException("el denominador no puede tener cero");
        }
        
        
        this.entero = entero;
        this.numerador= numerador;
        this.denominador= denominador;
         
    }

    public int getEntero() {
        return entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        
        return denominador;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) throws DenominadorCeroException {
        if(denominador == 0){
            throw new DenominadorCeroException("el denominador no puede tener cero");
        }
        this.denominador = denominador;
    }
    
    public Mixto sumar(Mixto f2) throws DenominadorCeroException {
    Mixto f;
    int enter,nume, den,nfra1,nfra2,numeres,deres;    
        
    nfra1= (this.entero * this.denominador) + this.numerador;
    nfra2= (f2.entero * f2.denominador) + f2.numerador;
    
    numeres= (nfra1 * f2.denominador) + (this.denominador * nfra2);
    deres= this.denominador * f2.denominador;
    
    enter= numeres / deres;
    nume= numeres % deres;
    den= deres;
    
    f = new Mixto(enter,nume, den);
    return f;
    }
     public Mixto resta (Mixto f2) throws DenominadorCeroException {
    Mixto f;
    int enter,nume, den,nfra1,nfra2,numeres,deres;    
        
    nfra1= (this.entero * this.denominador) + this.numerador;
    nfra2= (f2.entero * f2.denominador) + f2.numerador;
    
    numeres= (nfra1 * f2.denominador) -(this.denominador * nfra2);
    deres= this.denominador * f2.denominador;
    
    enter= numeres / deres;
    nume= numeres % deres;
    den= deres;
    
    f = new Mixto(enter,nume, den);
    return f;
    }
     
      public Mixto multiplicacion (Mixto f2) throws DenominadorCeroException {
    Mixto f;
    int enter,nume, den,nfra1,nfra2,numeres,deres;    
        
    nfra1= (this.entero * this.denominador) + this.numerador;
    nfra2= (f2.entero * f2.denominador) + f2.numerador;
    
    numeres= nfra1 * nfra2;
    deres= this.denominador * f2.denominador;
    
    enter= numeres / deres;
    nume= numeres % deres;
    den= deres;
    
    f = new Mixto(enter,nume, den);
    return f;
    }
      public Mixto dividir (Mixto f2) throws DenominadorCeroException {
    Mixto f;
    int ent,num, den,nfrac1,nfrac2,nres,dres;    
        
    nfrac1= (this.entero * this.denominador) + this.numerador;
    nfrac2= (f2.entero * f2.denominador) + f2.numerador;
    
    nres= nfrac1 * f2.denominador;
    dres= this.denominador * nfrac2;
    
    ent= nres / dres;
    num= nres % dres;
    den= dres;
    
     f = new Mixto(ent,num, den);
    return f;
    }
}
