// Desafio
// Neste desafio voc� dever� construir uma fun��o que recebe uma String e identifique se a mesma � um pal�ndromo, ou seja, se a String � igual a ela mesma invertida.
// Dado que temos a String "digital" uma vez invertida temos "latigid" que s�o diferentes.
// Logo, N�O � um Pal�ndromo.
// J� se recebemos a string "radar" uma vez invertida temos "radar" que s�o iguais.

import java.util.Scanner;

public class ChecagemPalindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--){
            novaPalavra = novaPalavra + letras[i];
        }

        System.out.println(novaPalavra.equals(palavra)?"TRUE":"FALSE");
    }
}
