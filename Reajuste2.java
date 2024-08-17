import java.util.Scanner;

public class Reajuste2 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        double salario = prompt.nextDouble();
        System.out.println("Informe o % de reajuste: ");
        double percReajuste = prompt.nextDouble();
        double salarioReajustado;

        salarioReajustado = salario + (salario/100*percReajuste);
        System.out.println("Com salario de "+salario+" obtendo um reajuste de "+percReajuste+"%");
        System.out.println("O valor reajustado fica "+salarioReajustado);
    }
}


