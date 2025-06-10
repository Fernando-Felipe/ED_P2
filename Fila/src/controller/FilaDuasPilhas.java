package controller;

public class FilaDuasPilhas<T> {
    private PilhaArray<T> pilhaEntrada;
    private PilhaArray<T> pilhaSaida;

    public FilaDuasPilhas() {
        pilhaEntrada = new PilhaArray<>();
        pilhaSaida = new PilhaArray<>();
    }

    public void enfileirar(T item) {
        pilhaEntrada.push(item);
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        moverSeNecessario();
        return pilhaSaida.pop();
    }

    public T primeiro() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        moverSeNecessario();
        return pilhaSaida.peek();
    }

    public boolean isEmpty() {
        return pilhaEntrada.isEmpty() && pilhaSaida.isEmpty();
    }

    public int size() {
        return pilhaEntrada.size() + pilhaSaida.size();
    }

    private void moverSeNecessario() {
        if (pilhaSaida.isEmpty()) {
            while (!pilhaEntrada.isEmpty()) {
                pilhaSaida.push(pilhaEntrada.pop());
            }
        }
    }
}