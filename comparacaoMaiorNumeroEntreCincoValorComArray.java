import java.util.Scanner;

public class comparacaoMaiorNumeroEntreCincoValorComArray {
    public static Integer[] recebeValores(Integer[] numeros){
        return numeros;
    }


    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer quantidade = 5;
        Integer numeros[] = new Integer[quantidade];
        Integer maiorValor = 0, maiorPosicao = 0;

        int i;
        for (i = 0; i < quantidade; i++) {
            System.out.println("Informe o " + (i + 1) + " valor: ");
            numeros[i] = prompt.nextInt();

            if (numeros[i] == 0) {
                maiorValor = numeros[i];
                maiorPosicao = i + 1;
            } else if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                maiorPosicao = i + 1;
            }
        }
        System.out.println("Os valores recebidos foram: ");
        for (int i = 0; i < quantidade; i++){
            System.out.println((i+1) + " posição = " + numeros[i]);
        }
        System.out.println("O maior valor é " +maiorValor + " na " + maiorPosicao + " posicao");
    }
}
