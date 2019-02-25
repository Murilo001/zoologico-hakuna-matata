package com.zoologico.animais;

/**
 *
 * @author Murilo
 */
public interface AnimalDomestico {
    final int REDUCAO_TEDIO_AO_BRINCAR = -1;
    final boolean SAUDAVEL = true;
    final boolean DOENTE = false;
    void brincar();
    void levarVeterinario();
}
