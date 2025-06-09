package controller;

public class NodeDuplo {
    int valor;
    NodeDuplo proximo;
    NodeDuplo anterior;

    public NodeDuplo(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}