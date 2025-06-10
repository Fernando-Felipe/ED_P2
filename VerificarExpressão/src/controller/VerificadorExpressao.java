public class VerificadorExpressao {
    public boolean verificar(String expressao) {
        PilhaArray<Character> pilha = new PilhaArray<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) return false;
                char topo = pilha.pop();
                if (!ehParCorrespondente(topo, c)) return false;
            }
        }

        return pilha.isEmpty();
    }

    private boolean ehParCorrespondente(char abre, char fecha) {
        return (abre == '(' && fecha == ')') ||
               (abre == '[' && fecha == ']') ||
               (abre == '{' && fecha == '}');
    }
}