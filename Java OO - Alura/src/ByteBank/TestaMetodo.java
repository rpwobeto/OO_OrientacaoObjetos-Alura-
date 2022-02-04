package ByteBank;

public class TestaMetodo {

    public static void main(String[] args) {

        //instanciando a ByteBank.Conta
        Conta contaDoRicardo = new Conta();

        contaDoRicardo.saldo = 100.0;

        contaDoRicardo.deposita(50.0);

        System.out.println(contaDoRicardo.saldo);

        boolean conseguiuRetirar = contaDoRicardo.saca(20);

        System.out.println("Novo saldo: " + contaDoRicardo.saldo);

        System.out.println(conseguiuRetirar);

        //instanciando a ByteBank.Conta
        Conta contaDoPedro = new Conta();

        contaDoPedro.deposita(1000);

        boolean sucessoTransferencia = contaDoPedro.transfere(3000, contaDoRicardo);

        if (sucessoTransferencia) {
            System.out.println("transferência com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        System.out.println("Saldo da ByteBank.Conta do Pedro: R$" + contaDoPedro.saldo);

        System.out.println("Saldo da ByteBank.Conta do Ricardo: R$" + contaDoRicardo.saldo);

        //Antes de receber atribuição
        System.out.println(contaDoRicardo.titular);

        contaDoRicardo.titular = "Ricardo";

        //Depois de receber atribuição
        System.out.println(contaDoRicardo.titular);

    }
}
