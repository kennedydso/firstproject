import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println(" Insira dez valores: ");
        try (Scanner sc = new Scanner(System.in)) {
            int numero = 0; 
            int soma = 0;
            for (int i = 0; i < 10; i++) { 
                numero = sc.nextInt(); 
                if(numero < 40){ 
                    soma = soma + numero; 
                }
            }
            System.out.println("o resultado de todos os números menores que 40 é :  "+soma);
        }
    }

}