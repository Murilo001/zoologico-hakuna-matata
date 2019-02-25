/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologico.animais;

/**
 *
 * @author Murilo
 */
public interface AnimalDomestico {
    final int REDUCAO_TEDIO_AO_BRINCAR = -1;
    final boolean SAUDAVEL = true;
    final boolean DOENTE = false;
    void brincar(boolean brincou);
    void levarVeterinario();
}
