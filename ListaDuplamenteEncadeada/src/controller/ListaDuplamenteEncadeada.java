package controller;

public class ListaDuplamenteEncadeada {
    NodeDuplo inicio;
    NodeDuplo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

  
    public void adicionar(int valor) {
        NodeDuplo novo = new NodeDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }


    public void remover(int valor) {
        NodeDuplo atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                if (atual == inicio) {
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                } else if (atual == fim) {
                    fim = atual.anterior;
                    if (fim != null) fim.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                System.out.println("Valor " + valor + " removido.");
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Valor " + valor + " não encontrado.");
    }

 
    public void buscar(int valor) {
        NodeDuplo atual = inicio;
        int pos = 0;

        while (atual != null) {
            if (atual.valor == valor) {
                System.out.println("Valor " + valor + " encontrado na posição " + pos);
                return;
            }
            atual = atual.proximo;
            pos++;
        }
        System.out.println("Valor " + valor + " não encontrado.");
    }

   
    public void imprimirFrente() {
        NodeDuplo atual = inicio;
        System.out.print("Frente: ");
        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

  
    public void imprimirTras() {
        NodeDuplo atual = fim;
        System.out.print("Trás: ");
        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.anterior;
        }
        System.out.println("null");
    }
    public void adicionarNaPosicao(int valor, int posicao) {
    NodeDuplo novo = new NodeDuplo(valor);

    if (posicao < 0) {
        System.out.println("Posição inválida.");
        return;
    }

    
    if (posicao == 0) {
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        return;
    }

   
    NodeDuplo atual = inicio;
    int i = 0;
    while (atual != null && i < posicao) {
        atual = atual.proximo;
        i++;
    }

  
    if (atual == null) {
        fim.proximo = novo;
        novo.anterior = fim;
        fim = novo;
    }
  
    else {
        NodeDuplo anterior = atual.anterior;
        anterior.proximo = novo;
        novo.anterior = anterior;
        novo.proximo = atual;
        atual.anterior = novo;
    }
}
}
