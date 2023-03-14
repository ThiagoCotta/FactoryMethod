package FactoryMethod;

public class AcaoFactory {
    public static IAcao obterAcao(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Acao" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ação inexistente");
        }
        if (!(objeto instanceof IAcao)) {
            throw new IllegalArgumentException("Ação inválida");
        }
        return (IAcao) objeto;
    }
}
