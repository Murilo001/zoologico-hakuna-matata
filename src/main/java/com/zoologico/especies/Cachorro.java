package com.zoologico.especies;

import com.zoologico.animais.AnimalDomestico;
import com.zoologico.animais.Mamifero;
import com.zoologico.atributos.Saude;
import com.zoologico.atributos.Tedio;

/**
 *
 * @author Murilo
 */
public class Cachorro extends Mamifero implements AnimalDomestico {
    private Saude saude;
    private Tedio nivelTedio;

    private Saude getSaude() {
        return saude;
    }

    private void setSaude(Saude saude) {
        this.saude = saude;
    }

    private Tedio getNivelTedio() {
        return nivelTedio;
    }

    private void setNivelTedio(Tedio nivelTedio) {
        this.nivelTedio = nivelTedio;
    }
    
    public Cachorro(int tetas) {
        super(tetas);
        setSaude(Saude.Saudavel);
        setNivelTedio(Tedio.Medio);
    }
    
    public String situacaoCachorro() {
        return "Seu nível de tédio está em: " + getNivelTedio().toString() + 
                " \n e seu cão está: " + getSaude().toString();
        
    }
    
    @Override
    public void brincar() {
        getNivelTedio().nivelTedio -= REDUCAO_TEDIO_AO_BRINCAR;
    }

    @Override
    public void levarVeterinario() {
        Saude saudeAtual = getSaude();
        saudeAtual.saude = SAUDAVEL;
        setSaude(saudeAtual);
    }
    
}
