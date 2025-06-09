package controller;

import javax.swing.JOptionPane;

public class ListaEncadeadaMetodos {
    Node inicio;
    
    public ListaEncadeadaMetodos(){
        this.inicio = null;
    }
    public void Adicionar(int valor){
        Node novo = new Node(valor);
        if(inicio == null){
            inicio = novo;
        }
        else{
          Node atual = inicio;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }
    public void Remover(){
        Node atual = inicio;
        int indice = 0; int i;
        indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do item para ser removido"));
        indice = indice - 1;
        
            if(indice == 0){
                inicio = inicio.proximo;
                return;
            }
                for(i = 0; i< indice-1; i++){
                    atual = atual.proximo;
                }
                    if(atual.proximo != null){
                        atual.proximo = atual.proximo.proximo;
                    }
    }
    public void Imprimir(){
        Node atual = inicio;
            while(atual != null){
                System.out.print(atual.valor+ " --> ");
                atual = atual.proximo;
            }
            System.out.println("null");
    }
    public void Buscar(){
        Node atual = inicio;
        int indice = 0; int i;
        indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do item para Busca"));
        indice = indice - 1;
        
            if(indice == 0){
                System.out.println(atual.valor);
                return;
            }
                for(i = 0; i< indice-1; i++){
                    atual = atual.proximo;
                }
                    if(atual.proximo != null){
                        System.out.println(atual.proximo.valor);
                    }
    } 
    public void Inverter() {
    Node anterior = null;
    Node atual = inicio;
    Node proximo = null;

    while (atual != null) {
        proximo = atual.proximo;   
        atual.proximo = anterior;  
        anterior = atual;          
        atual = proximo;           
    }
    inicio = anterior;  
}
}  