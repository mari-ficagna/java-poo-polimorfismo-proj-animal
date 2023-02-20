package pooaula12polimorfismoanimais;
// @author Mari 
 
public class Ave extends Animal{
    //Atributos
    private String corPena;
    private String nome;
    private String especie;
    //Metodos publicos
    public void fazerNinho(){
        System.out.println("Construindo o ninho...");
    }
    public void statusAve(){
        System.out.println(" ");
        System.out.println("******Ave******\nNome: "+this.getNome()+"\nEspecie: "+this.getEspecie());
        this.statusAnimal();
        System.out.println("Cor pena: "+this.getCorPena());
        System.out.println("");
    }
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }
    //Metodos especiais
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
