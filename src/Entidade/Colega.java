package Entidade;

/**
 * Created by jonat on 24/05/2016.
 */
public class Colega extends Grupo {
    private String localTrabalho;
    private String profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    @Override
    public Categories getDescricao() {
        return Categories.Colega;
    }
}
