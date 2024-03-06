// test about datas enter
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;
        int soma;
        
        System.out.print("\n Digite um valor: ");
        x = sc.nextInt();

        System.out.print("\n Digite outro valor: ");
        y = sc.nextInt();
        
        soma = x + y;
        
        System.out.print("\n A soma dos dois valores e: "+ soma);

        sc.close();
    }
}