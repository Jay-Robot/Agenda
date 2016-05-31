package Entidade;

/**
 * Created by jonat on 31/05/2016.
 */
public class Relacionamento {
    private Proximidade proximidade;

    private Grupo grupo;

    public enum Proximidade {
        Intimo, Proximo, Regular, Distante, Incompativel
    }

    public Relacionamento(Grupo c, Proximidade p) {
        grupo = c;
        proximidade = p;
    }

    public Grupo getGrupo() {
        return grupo;
    }
}
