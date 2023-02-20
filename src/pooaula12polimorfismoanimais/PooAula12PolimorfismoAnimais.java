package pooaula12polimorfismoanimais;
//@author Mari 

public class PooAula12PolimorfismoAnimais {

    public static void main(String[] args) {
        // Programa principal
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Tartaruga tartaruga = new Tartaruga();
        Cobra cobra = new Cobra();
        Canguru canguru = new Canguru();
        Cachorro dog = new Cachorro();
        
        dog.setPeso(7.30f);
        dog.setIdade(2);
        dog.setMembros(4);
        dog.setCorPelo("Marrom");
        dog.setNome("Bob");
        dog.setRaça("Pastor alemao");
        dog.statusCachorro();
        
        canguru.setCorPelo("Marrom");
        canguru.setIdade(4);
        canguru.setMembros(4);
        canguru.setPeso(20.50f);
        canguru.statusCanguru();
        
        peixe.setNome("Nemo");
        peixe.setEspecie("Peixe palhaco");
        peixe.setCorEscama("Laranja e branco");
        peixe.setIdade(1);
        peixe.setPeso(0.30f);
        peixe.statusPeixe();
        
        ave.setNome("Blu");
        ave.setEspecie("Arara azul");
        ave.setIdade(3);
        ave.setPeso(1.55f);
        ave.setCorPena("Azul");
        ave.statusAve();
        
        tartaruga.setNome("Frida");
        tartaruga.setEspecie("Tartaruga-russa");
        tartaruga.setIdade(80);
        tartaruga.setPeso(.90f);
        tartaruga.setMembros(4);
        tartaruga.statusTartaruga();
        
        cobra.setNome("Scarlet");
        cobra.setEspecie("Cascavel");
        cobra.setIdade(2);
        cobra.setPeso(5.6f);
        cobra.statusCobra();
        
        dog.locomover();
        canguru.locomover();
        ave.locomover();
        peixe.locomover();
        tartaruga.locomover();
        dog.emitirSom();
        canguru.emitirSom();
    }
}
