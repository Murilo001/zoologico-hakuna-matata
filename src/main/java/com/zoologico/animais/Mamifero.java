package com.zoologico.animais;

/**
 *
 * @author Murilo
 */
public class Mamifero extends Animal{
    private int quantidadeDeMamas;
    
    public void mamar(float quantidadeLeite) {
        Mamifero.comer(quantidadeLeite);
    }
    
}
