package ByteBank;

public class ConceitoReferencia {

    public static void main(String[] args) {

            Conta primeiraConta = new Conta();
            primeiraConta.saldo = 200;

        System.out.println("Inicia o atributo: R$ " + primeiraConta.saldo);

        System.out.println("----------------------------------------------");

        primeiraConta.saldo += 100;

        System.out.println("Primeira ByteBank.Conta: R$ " + primeiraConta.saldo);

        System.out.println("----------------------------------------------");

        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 50;

        System.out.println("Primeira ByteBank.Conta: R$ " + primeiraConta.saldo);

        System.out.println("Segunda ByteBank.Conta: R$ " + segundaConta.saldo);

        System.out.println("----------------------------------------------");

        System.out.println("Referência da Primeira ByteBank.Conta: " + primeiraConta);

        System.out.println("Referência da Segunda ByteBank.Conta: " + segundaConta);


    }
}
