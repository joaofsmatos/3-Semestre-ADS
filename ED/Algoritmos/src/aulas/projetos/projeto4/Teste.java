package aulas.projetos.projeto4;

import java.util.Stack;

public class Teste {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

}
