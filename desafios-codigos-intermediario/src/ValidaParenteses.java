// Desafio
// Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
// determine se uma determinada string é válida.

import java.util.ArrayList;

public class ValidaParenteses {
    public static void main(String[] args) {


        String expression = "(]";

        char temp;
        ArrayList<String> pilha = new ArrayList<>();


        for (int i = 0; i <= expression.length() - 1; i++) {
            temp = expression.charAt(i);

            switch(temp){
                case '(':
                    pilha.add("(");
                    break;
                case ')':
                    if (pilha.size() > 0) {
                        pilha.remove("(");
                    } else {
                        pilha.add(")");
                    }
                    break;
                case '[':
                    pilha.add("[");
                    break;
                case ']':
                    if (pilha.size() > 0) {
                        pilha.remove("[");
                    } else {
                        pilha.add("]");
                    }
                    break;

            }


        }
        if (pilha.size() == 0) {
            System.out.println("Expressão válida");
        }else {
            System.out.println("Expressão inválida");
        }
    }
}



