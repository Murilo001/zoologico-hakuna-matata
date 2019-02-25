package com.zoologico.animais;

import com.zoologico.atributos.Sexo;

/**
 * Base para qualquer animal.
 * 
 * @author Murilo
 */
public class Animal {

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
    
    public static float getPeso() {
        return peso;
    }

    public static void setPeso(float peso) {
        Animal.peso = peso;
    }

    public static float getAltura() {
        return altura;
    }

    public static void setAltura(float altura) {
        Animal.altura = altura;
    }

    public static Sexo getSexo() {
        return sexo;
    }

    public static void setSexo(Sexo sexo) {
        Animal.sexo = sexo;
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
