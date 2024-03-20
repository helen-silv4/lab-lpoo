public class Empresa {
    private float custoTotal;
    private final Funcionario[] cadastro = new Funcionario[10];

    public float getCustoTotal() {
        return custoTotal;
    }
    public void setCustoTotal(float custoTotal) {
        this.custoTotal = custoTotal;
    }

    /*
      ' ' = Sem Estudo
       B = Básico
       M = Médio
       G = Graduação
    */
    public void verificaFormacao(Funcionario func) {
        if(func.getFormacao().getGrauForm() == 'B'){
            System.out.println("Escola: " + func.getFormacao().getNomeInstituicao());
        }
        else if (func.getFormacao().getGrauForm() == 'M') {
            System.out.println("Escola: " + func.getFormacao().getNomeInstituicao());
        }
        else if(func.getFormacao().getGrauForm() == 'G'){
            System.out.println("Universidade: " + func.getFormacao().getNomeInstituicao());
        }
        else if(func.getFormacao().getGrauForm() == ' '){
            System.out.println("Nome: " + func.getNome() + ", Código: " + func.getCodigo());
        }
        else {
            System.out.println("Não encontrado!");
        }
    }

    public void cadastraFunc(Funcionario func){
        for(int c = 0; c < 10; c++){
            if(cadastro[c] == null) {
                if (c < 4 && func.getFormacao().getGrauForm() == 'B') {
                    cadastro[c] = func;
                    func.setRendaBasica(func.getRendaBasica() + (func.getRendaBasica() * 0.1f));
                    break;
                } else if (c < 8 && func.getFormacao().getGrauForm() == 'M') {
                    cadastro[c] = func;
                    func.setRendaBasica(func.getRendaBasica() + (func.getRendaBasica() * 0.5f));
                    break;
                } else if (func.getFormacao().getGrauForm() == 'G') {
                    cadastro[c] = func;
                    func.setRendaBasica(func.getRendaBasica() + (func.getRendaBasica() * 2));
                    break;
                }
            }
        }
    }

    public void mostraCadastro() {
        for(int c = 0; c < 10; c++){
            if(cadastro[c] != null){
                System.out.println(cadastro[c].toString());
            }
        }
    }

    public float calculoCustoT(){
        for(int c = 0; c < 10; c++){
            if(cadastro[c] != null){
                this.setCustoTotal(this.getCustoTotal() + cadastro[c].getRendaBasica());
            }
        }
        return this.getCustoTotal();
    }
}