import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsutaCep consutaCep = new ConsutaCep();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consutaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquico gerador = new GeradorDeArquico();
            gerador.salvaJson(novoEndereco);
        }catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("finalizando a aplicação");
        }


    }
}