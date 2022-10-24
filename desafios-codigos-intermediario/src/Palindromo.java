// Desafio
// Neste desafio voc� dever� construir uma fun��o que recebe uma String e identifique se a mesma � um pal�ndromo, ou seja, se a String � igual a ela mesma invertida.
// Dado que temos a String "digital" uma vez invertida temos "latigid" que s�o diferentes.
// Logo, N�O � um Pal�ndromo.
// J� se recebemos a string "radar" uma vez invertida temos "radar" que s�o iguais.


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
