/* Crie um programa de determine se uma pessoa possui uma idade superior a 17 anos.
O usuário deverá informar o nome, ano de nascimento e email da pessoa.
É obrigatório utilizar classe para representar a pessoa.*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Pessoa pessoa1 = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para determinar se a pessoa é maior de idade ou não:");

        System.out.println("Insira o nome da pessoa:");
        pessoa1.nome = sc.nextLine();
        System.out.println("Insira o email:");
        pessoa1.email = sc.nextLine();
        System.out.println("Insira o ano de nascimento:");

        pessoa1.anoNascimento = Integer.parseInt(sc.nextLine());
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int anoAtual = Integer.parseInt(dateFormat.format(date));
        int idade = anoAtual - pessoa1.anoNascimento;
        if (idade > 17){
            System.out.println(pessoa1.nome + " voce possui maioridade");
        }else{
            System.out.println(pessoa1.nome + " voce não possui maioridade");
        }



    }
}
