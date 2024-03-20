public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Zzzzzzzzzzz");
    }

    public void subirArvore(){
        System.out.println(super.getNome() + " está subindo a árvore!");
    }
}
