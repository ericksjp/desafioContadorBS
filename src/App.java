import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Digite o primeiro parâmetro: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int num2 = sc.nextInt();
            contar(num1, num2);
        } catch (InputMismatchException ex){
            System.out.printf("Erro: Entrada Inválida. (%s)\n",ex.toString());
        } catch (InvalidParameterException ex){
            System.out.printf("Erro: %s (%s)\n", ex.getMessage(), ex.toString());
        } catch (Exception ex){
            System.out.printf("Erro: Erro inesperado. (%s)", ex.toString());
        }
    }

    public static void contar(int num1, int num2) throws InvalidParameterException{
        if (num1 > num2){
            throw new InvalidParameterException("O segundo par\u00E2metro deve ser maior que o primeiro.");
        }

        int contagem =  num2 - num1;

        for (int c = 0; c < contagem; c++){
            System.out.println("Imprimindo o numero: " + (c+1));
        }
    }

}
