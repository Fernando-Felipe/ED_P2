package view;
import controller.ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionarNaPosicao(5, 0); 
        lista.adicionarNaPosicao(15, 1);  
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);

        lista.imprimirFrente();
        lista.imprimirTras();

        lista.buscar(30);
        lista.remover(20);

        lista.imprimirFrente();
        lista.imprimirTras();
    }
}