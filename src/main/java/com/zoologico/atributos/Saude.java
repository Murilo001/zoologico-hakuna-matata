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
public enum Saude {
    Saudavel(true),Doente(false);
    
    public boolean saude;
    Saude(boolean valor)
    {
        saude = valor;
    }
}