/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologico.especies;

import com.zoologico.animais.Ave;
import com.zoologico.atributos.Sexo;

/**
 *
 * @author Murilo
 */
public class Flamingo extends Ave {
    
    private float quilosPeixeNoDia;

    public float getQuilosPeixePorDia() {
        return quilosPeixeNoDia;
    }

    public void setQuilosPeixePorDia(float quilosPeixePorDia) {
        this.quilosPeixeNoDia += quilosPeixePorDia;
    }
    
    public Flamingo(float peso, float altura, Sexo sexo) {
    }
    
}
