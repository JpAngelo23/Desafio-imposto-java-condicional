import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Rendas e Valores
        double salarioAnual = 0;
        double salarioMensal = 0;

        double prestacaoServiço = 0;
        double ganhoCapital = 0;
        double gastoMedico = 0;
        double gastoEducacionais = 0;

        // impostos
        double impostoSalario = 0;
        double impostoServicos = 0;
        double impostoGanhoCapital = 0;

        // Deduções
        double maximoDedutivel = 0;
        double gastosDedutiveis = 0;

        // Resumo
        double impostoBruto = 0;
        double abatimento = 0;
        double impostoDevido = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da Renda Anual com Salário: ");
        salarioAnual = sc.nextDouble();

        System.out.println("Digite o valor da Renda Anual com Prestação de Serviços: ");
        prestacaoServiço = sc.nextDouble();

        System.out.println("Digite o valor da Renda Anual com Ganho de Capital: ");
        ganhoCapital = sc.nextDouble();

        System.out.println("Digite o valor dos Gastos Médicos do período: ");
        gastoMedico = sc.nextDouble();

        System.out.println("Digite o valor dos Gastos Educacionais do período: ");
        gastoEducacionais = sc.nextDouble();

        sc.close();

        salarioMensal = salarioAnual / 12;


        // Bloco Imposto sobre Salario:
        if (salarioMensal < 3000.00) {
            impostoSalario = 0;
        }

        else if (salarioMensal > 3000.00 && salarioMensal <= 5000.00) {
            impostoSalario = salarioAnual * 0.10;
        }

        else {
            impostoSalario = salarioAnual * 0.20;
        }
        // ----------------------------------------------------------


        // Bloco Imposto sobre Serviços:
        if (prestacaoServiço > 0) {
            impostoServicos = prestacaoServiço * 0.15;
        }

        // Bloco Imposto sobre Ganho de Capital:
        if (ganhoCapital > 0) {
            impostoGanhoCapital = ganhoCapital * 0.20;
        }

        impostoBruto = impostoSalario + impostoServicos + impostoGanhoCapital;

        gastosDedutiveis = gastoMedico + gastoEducacionais;

        maximoDedutivel = impostoBruto * 0.30;


        if ( (gastoMedico + gastoEducacionais) > maximoDedutivel) {
            impostoDevido = impostoBruto - maximoDedutivel;
            abatimento = maximoDedutivel;
        }  else {
            impostoDevido = impostoBruto - (gastoMedico + gastoEducacionais);
            abatimento = gastoMedico + gastoEducacionais;
        }

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println("");
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre Salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre Serviços: %.2f%n", impostoServicos);
        System.out.printf("Imposto sobre Ganho de Capital: %.2f%n", impostoGanhoCapital);
        System.out.println("");
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
        System.out.printf("Gastos Dedutíveis: %.2f%n", gastosDedutiveis);
        System.out.println("");
        System.out.println("***** RESUMO ******");
        System.out.printf("Imposto Bruto Total: %.2f%n", impostoBruto);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto Devido: %.2f%n", impostoDevido);


    } //Fim da classa MAIN
} // FIM