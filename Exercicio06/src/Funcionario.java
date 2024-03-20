public class Funcionario {
    private Comissao comissao;
    private float renda;

    public Funcionario() {
        this.comissao = new Comissao();
        this.renda = 1000.0f;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public float getRenda() {
        return renda;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float verificaComissao(){
        return 0.0f;
    }

    public float rendaTotal() {
        float rendaTotal = this.getRenda();
        if (comissao != null) {
            rendaTotal += comissao.getValorComissao();
        }
        return rendaTotal;
    }
}