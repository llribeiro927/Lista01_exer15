import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que pergunte quanto você ganha por hora
        // e o número de horas trabalhadas no mês
        // Calcule e mostre o total do seu salário no referido mês
        // sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato
        // faça um programa que nos dê:
        // salário bruto.
        // quanto pagou ao INSS.
        // quanto pagou ao sindicato.
        // o salário líquido.
        // calcule os descontos e o salário líquido, conforme a tabela abaixo:
        // + Salário Bruto : R$
        // - IR (11%) : R$
        // - INSS (8%) : R$
        // - Sindicato ( 5%) : R$
        // = Salário Liquido : R$
        double salario_bruto; 
        double imposto_de_renda;
        double inss; 
        double salario_liquido; 
        double sindicato; 
        double horas_trabalhadas; 
        double valor_hora;

        System.out.println("Informe o seu salário por hora: ");
        Scanner teclado = new Scanner(System.in); 
        valor_hora = teclado.nextDouble(); 

        System.out.println("Informe as horas trabalhadas por mês: ");
         horas_trabalhadas = teclado.nextDouble(); 

         salario_bruto = valor_hora * horas_trabalhadas; 

         imposto_de_renda = salario_bruto * 0.11;

         inss = salario_bruto * 0.08;

         sindicato = salario_bruto * 0.05; 

         salario_liquido = (salario_bruto - imposto_de_renda - inss - sindicato);
         
         System.out.println("O seu salário bruto por mês é de: R$ " + salario_bruto);
         System.out.println("O valor do imposto de renda foi: R$ " + imposto_de_renda);
         System.out.println("Você pagou para o INSS: R$ " + inss);
         System.out.println("Você pagou para o sindicato: R$ " + sindicato);
         System.out.println("Seu salário líquido é de: R$ " + salario_liquido);
         teclado.close();
         







         
        

    }
}
