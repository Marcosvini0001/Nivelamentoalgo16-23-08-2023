import java.util.Scanner;

public class ReajusteDeSalario {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        double salario = prompt.nextDouble();
        double salarioReajustado = salario;
        //quem ganhar ate 1412 - reajuste de 12%
        //quem ganhar ate 3000 - reajuste de 9%
        //quem ganhar ate 5000 - reajuste de 5%
        //quem ganhar mais de 5000 - sem reajuste

        if(salario <= 1412){
            salarioReajustado = salarioReajustado * 1.12;
        } else if(salario <= 3000){
            salarioReajustado = salarioReajustado * 1.09;
        } else if(salario <= 5000){
            salarioReajustado = salarioReajustado * 1.05;
        }

        System.out.println("Resultado após reajuste: "+salarioReajustado);
    }
}
