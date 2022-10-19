package one.dio.gof.strategy;

public class Robot {

    private Comportamento comportamento; // essa � minha estrat�gia

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void movendo(){
        comportamento.mover();
    }

}
