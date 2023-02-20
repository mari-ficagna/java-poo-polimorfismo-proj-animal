package pooaula12polimorfismoanimais;
//@author Mari 
 
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    private String especie;
    private String nome;
    //Metodos publicos
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    public void statusPeixe(){
        System.out.println(" ");
        System.out.println("******Peixe******\nNome: "+this.getNome()+"\nEspecie: "+this.getEspecie());
        this.statusAnimal();
        System.out.println("Cor escama: "+this.getCorEscama());
        System.out.println("");
    }
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz sons!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias...");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }
    //Metodos especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
