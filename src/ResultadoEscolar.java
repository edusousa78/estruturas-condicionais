public class ResultadoEscolar {
public static void main(String[] args) {
    
//condição simple, composta e encadeada
    int nota = 8;

    if(nota >= 7){
        System.out.println("Aluno Aprovado, com a nota " + nota + "!");
    } else if(nota > 5 && nota < 7){

        System.out.println("Prova de Recuperação");

    } else {
        System.out.println("Aluno Reprovado, com a nota " + nota + "!");
    }
    
}
}
