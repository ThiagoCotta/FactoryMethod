package FactoryMethod;

public class AcaoMapa implements IAcao{
    public String executarMenu() {
        return "Mapa sendo exibido";
    }

    public String fecharMenu() {
        return "Mapa sendo fechado";
    }
}
