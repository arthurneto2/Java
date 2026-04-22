package estruturasDeDados.pilha;

public class Mai {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek()); // 30
        System.out.println("Tamanho da pilha: " + pilha.size()); // 3

        System.out.println("Pop: " + pilha.pop()); // 30
        System.out.println("Topo após pop: " + pilha.peek()); // 20
        System.out.println("Tamanho após pop: " + pilha.size()); // 2
    }
}
