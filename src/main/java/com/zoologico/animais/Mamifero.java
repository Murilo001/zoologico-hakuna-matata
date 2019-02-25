package com.zoologico.animais;

/**
 *
 * @author Murilo
 */
public class Mamifero extends Animal{
    
    private final int quantidadeTetas;
    
    public Mamifero(int tetas) {
        quantidadeTetas = tetas;
    }
    
    public void mamar(float quantidadeLeite) {
        Mamifero.comer(quantidadeLeite);
    }
    
}
