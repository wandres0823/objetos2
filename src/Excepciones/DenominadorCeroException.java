/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author adalberto
 */
public class DenominadorCeroException extends Exception {
    public DenominadorCeroException(String msg){
        super ("no se permite denominador cero");
        
    }
    }

   
