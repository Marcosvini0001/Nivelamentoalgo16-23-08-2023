import java.util.Scanner;

public class validacaoSenha {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer senhaCorreta = 12345, maxTentativas = 3;
        Integer senhaDigitada=0, quantidadeTentativas = 0;

        do{
            System.out.println("Informe a senha: ");
            senhaDigitada = prompt.nextInt();
            if (!senhaDigitada.equals(senhaCorreta));{
                System.out.println("Senha Incorreta!");
                quantidadeTentativas++;
            }
        } while (!senhaDigitada.equals(senhaCorreta) && quantidadeTentativas < maxTentativas);

        if (quantidadeTentativas.equals(maxTentativas)){
            System.out.println("Sua conta está bloqueada!");
        } else{
            System.out.println("Senha Correta!");
        }
    }
}
