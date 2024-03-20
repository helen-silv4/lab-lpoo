public class Formacao{
    private char grauForm;
    private String nomeInstituicao;

    public Formacao(String nomeInstituicao, char grauForm) {
        this.nomeInstituicao = nomeInstituicao;
        this.grauForm = grauForm;
    }

    public char getGrauForm() {
        return grauForm;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public void setGrauForm(char grauForm) {
        this.grauForm = grauForm;
    }

    @Override
    public String toString() {
        return "(Grau: " + this.getGrauForm() + ", Instituição: " + this.getNomeInstituicao() + ")";
    }
}
