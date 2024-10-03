package Studies.POO_Guanabara.Aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 1;
        this.ligado = false;
        this.tocando = false;
    }

    //metódos especiais;
    private int getVolume() {
        return volume;
    }

    public void setVolume(int V) {
        this.volume = V;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean L) {
        this.ligado = L;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean T){
        this.tocando = T;
    }

    //métodos abstratos;
    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("---MENU---");
        System.out.println("Ligado?: " + this.ligado);
        System.out.println("Está tocando? " + this.tocando);
        System.out.println("Volume: " + this.volume);
        for(int i=0; i<=this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+1);
        }
    }

    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-1);
        }
    }

    public void ligarMudo() {
        if(this.getLigado()){
            if(this.getVolume() > 0){
                this.setVolume(0);
            } else if(this.getVolume() == 0){
                System.out.println("Está mutado");
            }
        }
    }

    public void desligarMudo() {
        if(this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    public void pause() {
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }

    }
}
