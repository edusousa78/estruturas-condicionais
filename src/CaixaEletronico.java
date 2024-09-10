import java.text.NumberFormat;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 350.00;
        double valorSolicitado = 55.00;

        if (valorSolicitado < saldo) {

            System.out.println("Saldo Anterior: " + NumberFormat.getCurrencyInstance().format(saldo));
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado no valor de: "+ NumberFormat.getCurrencyInstance().format(valorSolicitado) + "\nSaldo Atual:" + NumberFormat.getCurrencyInstance().format(saldo));
        }else{
            System.out.println("Você não tem soldo suficiente! O saldo atual é: " + NumberFormat.getCurrencyInstance().format(saldo));
        }
    }

}
