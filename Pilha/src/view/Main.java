public class Main {
    
    public static void main(String[] args) {
        PilhaArray<Integer> pilha = new PilhaArray<>();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando elementos: 10, 20, 30");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Topo agora: " + pilha.peek());

        System.out.println("Tamanho após pop: " + pilha.size());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
