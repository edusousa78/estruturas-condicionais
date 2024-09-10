public class ResultadoTernario {
    public static void main(String[] args) {
        // condições ternarias
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado com a nota: " : nota >= 5 && nota <7 ? "Recuperação com a nota: " : "Reprovado com a nota: ";

        System.out.println(resultado + nota);
    }

}
