import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // String nome = args [0];
        // String sobreNome = args [1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo" + nome + " " + sobreNome);
        System.out.println("Tenho" + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
    }
    
}