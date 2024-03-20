import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private int qtdAtual;

    private List<Pessoa> qtdPessoasCadastradas = new ArrayList<>();

    public int getQtdAtual() {
        return qtdAtual;
    }

    public List<Pessoa> getQtdPessoasCadastradas() {
        return qtdPessoasCadastradas;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdPessoasCadastradas(List<Pessoa> qtdPessoasCadastradas) {
        this.qtdPessoasCadastradas = qtdPessoasCadastradas;
    }

    public void cadastraPessoa(Pessoa pess){
        this.getQtdPessoasCadastradas().add(pess);
        this.setQtdAtual(this.getQtdAtual() + 1);
    }

    public void imprimeCadastro(){
        System.out.println("----------------------------------------");
        for (Pessoa pessoa : this.qtdPessoasCadastradas) {
            pessoa.imprimirDados();
            System.out.println("----------------------------------------");
        }
    }
}
