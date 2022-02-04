package Cliente;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente ricardo = new Cliente();

        ricardo.nome = "Ricardo Wobeto";
        ricardo.cpf = "123.456-78";
        ricardo.profissao = "programador";

        Conta contaDoRicardo = new Conta();
        contaDoRicardo.deposita(100.0);

        //Associa o cliente ricardo a contaDoRicardo
        contaDoRicardo.titular = ricardo;

        System.out.println(contaDoRicardo.titular.nome);
        System.out.println(contaDoRicardo.titular);
        System.out.println(ricardo);

    }
}
