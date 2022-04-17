
import java.util.Scanner;

public class TedDoWhile {
    public static void main (String[] args) {
        System.out.print("Informe um número inteiro (0 para sair): ");
        Scanner sc = new Scanner(System.in);
        int numberUser = sc.nextInt();

        int countPositivo = 0;
        int countNegativo = 0;
        int somaPositivo = 0;
        int somaNegativo = 0;
        int somaGeral;
        float media;


        do{
            if(numberUser > 0){
                System.out.print("Informe um número inteiro (0 para sair): ");
                somaPositivo += numberUser;
                numberUser = sc.nextInt();
                countPositivo++;
            } else {
                System.out.print("Informe um número inteiro (0 para sair): ");
                somaNegativo += numberUser;
                numberUser = sc.nextInt();
                countNegativo++;
            }
        }
        while(numberUser != 0);

        System.out.println("Quantidade de números positivos: " + countPositivo);
        System.out.println("Quantidade de número negativos: " + countNegativo);
        System.out.println("Soma positivos " + somaPositivo);
        System.out.println("Soma negativos: " + somaNegativo);
        somaGeral = somaPositivo + somaNegativo;
        int qtdElementos = countPositivo + countNegativo;
        media = somaGeral/qtdElementos;
        System.out.println("Soma total: " + somaGeral);
        System.out.print("Média: " + media);

    }
}
