public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data data, Endereco endereco, int codigo) {
        super(nome, data, endereco);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Código: " + this.getCodigo() +
                           "\nNome: " + super.getNome() +
                           "\nNascimento: " + super.getData() +
                           "\nEndereço: " + super.getEndereco());
    }
}
