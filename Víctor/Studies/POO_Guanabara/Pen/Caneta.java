package Víctor.Studies.POO_Guanabara.Pen;

public class Caneta {
    String modelo; //caractere
    String cor; //carctere
    float ponta; //real
    int carga; //inteiro
    boolean tampada; //false or true

    void status() {
        System.out.println("Uma caneta de cor " + this.cor); //escreve a cor da caneta;
        System.out.println("Ponta: " + this.ponta); //a espessura da ponta;
        System.out.println("Modelo: " + this.modelo); //o modelo da mesma;
        System.out.println("Carga: " + this.carga); //carga
        System.out.println("Está tampada? " + this.tampada); //se está ou não tampada;
    }

    void rabiscar() { //se a caneta estiver tampada, logo, não posso rabiscar. Em caso contrário, rabisca algo.
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() { //"void" realiza uma ação, mas não fornece um resultado de volta ao código que o chamou, logo, devemos dar esse valor que voltará ao objeto que chamou;
        this.tampada = true; //"This" é uma referêcia ao objeto que chamou o método(nesse caso, o 'c1');
    }

    void destampar() {
        this.tampada = false;
    }
}
