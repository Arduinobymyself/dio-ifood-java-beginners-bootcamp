// Desafio
// Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida.
// Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
// Logo, NÃO é um Palíndromo.
// Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.


public class Palindromo {
    public static void main(String[] args) {
        String palavra = "ana";
        int tamanho = palavra.length();
        char[] tempCharArray = new char[tamanho];
        char[] charArray = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tempCharArray[i] = palavra.charAt(i);
        }

        for (int j = 0; j < tamanho; j++) {
            charArray[j] = tempCharArray[tamanho - 1 - j];
        }
        String palavraInvertida = new String(charArray);

        if(palavra.equals(palavraInvertida)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
