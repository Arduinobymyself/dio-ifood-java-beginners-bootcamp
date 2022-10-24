
// Desafio
// Dado um inteiro n, retorne o menor n�mero de n�meros quadrados perfeitos cuja soma seja n.
// Um quadrado perfeito � um inteiro que � o quadrado de um inteiro; em outras palavras, � o produto de algum inteiro consigo mesmo.
// Por exemplo, 1, 4, 9 e 16 s�o quadrados perfeitos, enquanto 3 e 11 n�o s�o.


import java.util.Scanner;

public class VerificaQuadradosPerfeitos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um n�mero");
        int num = scan.nextInt();
        double sqrt = Math.ceil(Math.sqrt(num));
        if (Math.pow(sqrt, 2) != num) {
            System.out.println("N�o � quadrado perfeito");
        } else {
            System.out.println("� quadrado perfeito");
        }

    }
}

