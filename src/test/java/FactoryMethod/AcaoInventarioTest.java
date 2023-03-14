package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcaoInventarioTest {
    @Test
    void deveAbrirInventario() {
        IAcao acao = AcaoFactory.obterAcao("Inventario");
        assertEquals("Inventário sendo exibido", acao.executarMenu());
    }

    @Test
    void deveFecharInventario() {
        IAcao acao = AcaoFactory.obterAcao("Inventario");
        assertEquals("Inventário sendo fechado", acao.fecharMenu());
    }
}
