package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcaoMapaTest {
    @Test
    void deveAbrirMapa() {
        IAcao acao = AcaoFactory.obterAcao("Mapa");
        assertEquals("Mapa sendo exibido", acao.executarMenu());
    }

    @Test
    void deveFecharMapa() {
        IAcao acao = AcaoFactory.obterAcao("Mapa");
        assertEquals("Mapa sendo fechado", acao.fecharMenu());
    }
}
