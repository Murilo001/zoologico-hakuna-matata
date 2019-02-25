package com.zoologico.animais;

import com.zoologico.atributos.Sexo;

/**
 * Base para qualquer animal.
 * 
 * @author Murilo
 */
public abstract class Animal {

    /**
     * Quantidade de massa em KiloGrama.
     */
    private static float peso;
    
    /** Altura do animal em metros.
    */
    private static float altura;
    
    /** Sexo do animal, macho ou fêmea.
    */
    private static Sexo sexo;
    
    private static float getPeso() {
        return peso;
    }

    private static void setPeso(float peso) {
        Animal.peso = peso;
    }

    private static float getAltura() {
        return altura;
    }

    private static void setAltura(float altura) {
        Animal.altura = altura;
    }

    private static Sexo getSexo() {
        return sexo;
    }

    private static void setSexo(Sexo sexo) {
        Animal.sexo = sexo;
    }
    
    public void Animal(float peso, float altura, Sexo sexo) {
        setPeso(peso);
        setAltura(altura);
        setSexo(sexo);
    }

    /**
     * Método utilizado quando o animal come.
     * 
     * @param quantidadeComida Parâmetro que o animal comeu, que será adicionado
     * ao seu peso.
     */
    public static void comer(float quantidadeComida) {
        if (quantidadeComida > 0)
            Animal.peso += quantidadeComida;
    }
    
    
}
