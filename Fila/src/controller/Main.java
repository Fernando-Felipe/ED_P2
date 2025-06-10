package controller;
import controller.FilaArray;
import controller.FilaDuasPilhas;
public class Main {
    public static void main(String[] args) {
        System.out.println("Teste FilaArray:");
        FilaArray<Integer> fila = new FilaArray<>(5);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println("Primeiro: " + fila.primeiro());
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        System.out.println("Novo primeiro: " + fila.primeiro());

        System.out.println("\nTeste FilaDuasPilhas:");
        FilaDuasPilhas<String> filaPilha = new FilaDuasPilhas<>();
        filaPilha.enfileirar("Fruto");
        filaPilha.enfileirar("da");
        filaPilha.enfileirar("Arte");
        System.out.println("Primeiro: " + filaPilha.primeiro());
        System.out.println("Desenfileirando: " + filaPilha.desenfileirar());
        System.out.println("Novo primeiro: " + filaPilha.primeiro());
    }
}
