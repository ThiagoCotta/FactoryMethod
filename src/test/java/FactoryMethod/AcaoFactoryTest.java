package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AcaoFactoryTest {
    @Test
    void deveRetornarExcecaoParaAcaoInexistente() {
        try {
            IAcao acao = AcaoFactory.obterAcao("Personagem");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAcaoInvalida() {
        try {
            IAcao acao = AcaoFactory.obterAcao("Loja");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inválida", e.getMessage());
        }
    }
}
