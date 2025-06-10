public class Main {
    public static void main(String[] args) {
        VerificadorExpressao verificador = new VerificadorExpressao();

        String exp1 = "{[()()]}";
        String exp2 = "{[(])}";
        String exp3 = "((()))[]";
        String exp4 = "([)]";

        System.out.println(verificador.verificar(exp1)); // true
        System.out.println(verificador.verificar(exp2)); // false
        System.out.println(verificador.verificar(exp3)); // true
        System.out.println(verificador.verificar(exp4)); // false
    }
}
