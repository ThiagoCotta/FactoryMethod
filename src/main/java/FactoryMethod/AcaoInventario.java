package FactoryMethod;

public class AcaoInventario implements IAcao{
    public String executarMenu() {
        return "Inventário sendo exibido";
    }

    public String fecharMenu() {
        return "Inventário sendo fechado";
    }
}
