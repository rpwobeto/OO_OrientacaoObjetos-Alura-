package Cliente;

public class TestaContaSemCliente {

    public static void main(String[] args) {

        Conta contaDoRicardo = new Conta();
        System.out.println(contaDoRicardo.saldo);


        contaDoRicardo.titular = new Cliente();
        System.out.println(contaDoRicardo.titular);

        contaDoRicardo.titular.nome = "Ricardo";
        System.out.println(contaDoRicardo.titular.nome);

    }
}
