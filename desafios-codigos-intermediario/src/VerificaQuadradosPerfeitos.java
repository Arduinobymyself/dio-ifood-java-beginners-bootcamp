
// Desafio
// Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
// Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo.
// Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.


import java.util.Scanner;

public class VerificaQuadradosPerfeitos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = scan.nextInt();
        double sqrt = Math.ceil(Math.sqrt(num));
        if (Math.pow(sqrt, 2) != num) {
            System.out.println("Não é quadrado perfeito");
        } else {
            System.out.println("É quadrado perfeito");
        }

    }
}

