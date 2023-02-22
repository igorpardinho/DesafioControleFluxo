import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = sc.nextInt();
        try {
            contar(primeiroNumero,segundoNumero);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro");
        }


    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = numero2 - numero1;

            for (int i = 1; i <= contagem; i++){
                System.out.println("imprimindo o numero " + i);
            }
        }
    }
}