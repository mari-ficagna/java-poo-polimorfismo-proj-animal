package pooaula12polimorfismoanimais;
// @author Mari 

public class Tartaruga extends Reptil{
    //Atributos
    public String nome;
    public String especie;
    //Metodos publicos
    public void statusTartaruga(){
        System.out.println(" ");
        System.out.println("******Tartaruga******\nNome: "+this.getNome()+"\nEspecie: "+this.getEspecie());
        this.statusReptil();
        System.out.println(""); 
    }
    //Metodos sobreposicao
    @Override
    public void locomover() {
        //Metodo sobreposto com assinatura diferente
        System.out.println("Andando bem devagar...");
        //super.locomover(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    //Metodos especiais
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
