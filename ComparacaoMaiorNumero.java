import java.util.Scanner;

//Escreva um programa para ler 2 valores (Valide para nao aparecer valores iguais) e escrever o maior deles

public class ComparacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        Integer numero1 = prompt.nextInt();

        System.out.println("Informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();

        if (numero1 > numero2){
            System.out.println("O numero 1: " + numero1 + " é maior que o numero 2: " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O numero 1: " + numero1 + " é menor que o numero 2: " + numero2);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
