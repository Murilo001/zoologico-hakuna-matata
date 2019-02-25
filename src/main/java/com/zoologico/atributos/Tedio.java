/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologico.atributos;

/**
 *
 * @author Murilo
 */
public enum Tedio {
    
    Baixo(5), Medio(10), Alto(20);
    
    public int nivelTedio;
    
    Tedio(int valor) {
        nivelTedio = valor;
    }
}
