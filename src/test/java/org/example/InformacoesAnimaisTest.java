package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformacoesAnimaisTest {

    @Test
    public void deveRetornarEspecieAnimal() {
        InformacoesAnimais.getInstance().setEspecie("Gato");
        assertEquals("Gato", InformacoesAnimais.getInstance().getEspecie());
    }

    @Test
    public void deveRetornarNomeAnimal() {
        InformacoesAnimais.getInstance().setNomeAnimal("Banguela");
        assertEquals("Banguela", InformacoesAnimais.getInstance().getNomeAnimal());
    }

}