package Studies.POO_Guanabara.Aula05;

public class ContaBanco {
    public int numConta;
    private String dono;
    protected String tipo;
    private float saldo;
    private boolean status;

    //construct;
    public ContaBanco() { //quando criado, o status é falso e o saldo é 0;
        this.setStatus(false);;
        this.setSaldo(0);;
    }

    //métodos;
    public void abrirConta(String T) {
        this.setTipo(T);
        this.setStatus(true);

        if(T == "CC") {
            this.setSaldo(50);
        } else if(T == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if(this.getSaldo() < 0) {
            System.out.println("Em débito, page sua dívida!");
        } else if(this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro não pode ser fechada!");
        } else if(this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
    }

    public void depositar(float V) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + V);
            System.out.println("Deposito efetuado na conta de: " + this.getDono());
        } else {
            System.out.println("Não pode depositar!");
        }
    }

    public void sacar(float V) {
        if(this.getStatus()) {
            if(this.getSaldo() >= V) {
                this.setSaldo(this.getSaldo() - V);
                System.out.println("Saque efetuado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
          System.out.println("Conta fechada, não pode sacar!");
        }
    }

    public void pagarMensal() {
        int V_local = 0;
        if(this.getTipo() == "CC") {
            V_local = 12;
        } else if(this.getTipo() == "CP"){
            V_local = 20;
        }
        
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - V_local);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        }

        else {
            System.out.println("Impossível efetuar o pagamento!");
        }
    }


    //sets e gets;
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int N) {
        this.numConta = N;
    }

    //
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float S) {
        this.saldo = S;
    }

    //
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String T) {
        this.tipo = T;
    }

    //
    public String getDono() {
        return this.dono;
    }

    public void setDono(String D) {
        this.dono =  D;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean ST) {
        this.status = ST;
    }
    //status;
    public void status() {
        System.out.println("----------------------------------");
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Num: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
    }
}
