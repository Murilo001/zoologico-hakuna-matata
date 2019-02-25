package com.zoologico.especies;

import com.zoologico.animais.AnimalDomestico;
import com.zoologico.animais.Mamifero;
import com.zoologico.atributos.Saude;
import com.zoologico.atributos.Sexo;
import com.zoologico.atributos.Tedio;

/**
 *
 * @author Murilo
 */
public class Cachorro extends Mamifero implements AnimalDomestico {
    private Saude saude;
    private Tedio nivelTedio;
    
    public Cachorro(float peso, float altura, Sexo sexo) {
        setPeso(peso);
        setAltura(altura);
        setSexo(sexo);
    }

    @Override
    public void brincar(boolean brincou) {
        nivelTedio.nivelTedio -= REDUCAO_TEDIO_AO_BRINCAR;
    }

    @Override
    public void levarVeterinario() {
        saude.saude = SAUDAVEL;
    }
    
}
