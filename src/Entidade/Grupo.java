package Entidade;

/**
 * Created by jonat on 31/05/2016.
 */
public abstract class Grupo {
    private String referencia;

    public enum Categories {
        Familia, Amigo, Colega
    }

    public abstract Categories getDescricao();

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }
}