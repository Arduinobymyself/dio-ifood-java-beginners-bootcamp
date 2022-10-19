package one.dio.gof.strategy;

public class Main {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robot robot = new Robot();
        robot.setComportamento(normal);
        robot.movendo();
        robot.movendo();
        System.out.println("======================");
        robot.setComportamento(defensivo);
        robot.movendo();
        System.out.println("======================");
        robot.setComportamento(agressivo);
        robot.movendo();
        robot.movendo();
        robot.movendo();
        System.out.println("======================");



    }
}
