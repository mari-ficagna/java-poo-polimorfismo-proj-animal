package pooaula12polimorfismoanimais;
//@author Mari (48) 99618-5728
 
public class Cobra extends Reptil{
    //Atributo
    public String nome;
    public String especie;
    //Metodos publicos
    public void statusCobra(){
        System.out.println(" ");
        System.out.println("******Cobra******\nNome: "+this.getNome()+"\nEspecie: "+this.getEspecie());
        this.statusReptil();
        System.out.println("");
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
