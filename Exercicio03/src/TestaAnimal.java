public class TestaAnimal {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Scooby", 8);
        Animal cavalo = new Cavalo("Cavalo Pocotó", 15);
        Animal preguica = new Preguica("Preguicinha", 20);
        Preguica preguica2 = new Preguica("Preguicinha", 25);

        System.out.println("------------------- SOM DOS ANIMAIS --------------------");
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        System.out.println("\n------------------ AÇÕES DOS ANIMAIS -------------------");
        cachorro.correr();
        cavalo.correr();
        preguica.correr(); // na classe Preguiça o método correr() NÃO FOI SOBRESCRITO, então herda da sua mãe (Animal)
        preguica2.subirArvore(); // só consigo chamar o método subirArvore() se a classe de instância do meu obj for a mesma

        System.out.println("\n------------ MÉTODO EXAMINAR DO VETERINÁRIO ------------");
        Veterinario vet = new Veterinario();

        vet.examinar(cachorro, cavalo, preguica);

        System.out.println("\n---------------------- ZOOLÓGICO -----------------------");
        Zoologico zoo = new Zoologico();

        zoo.colocaAnimal(cachorro);
        zoo.colocaAnimal(cavalo);
        zoo.colocaAnimal(preguica);

        zoo.percorreJaula();
    }
}