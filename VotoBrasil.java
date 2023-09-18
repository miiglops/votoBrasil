import java.util.Scanner;

public class VotoBrasil{
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNasc = keyboardScanner.nextInt();
        int idade = 2023 - anoNasc;
        System.out.println("Você tem " +idade+" anos");
        if (idade<16) {
            System.out.println("Não vota");
        } else if ((idade>15 && idade<18)||idade>70) {
            System.out.println("Voto opcional!");
        } else {
            System.out.println("Voto obrigatório!");
        }
    }
}