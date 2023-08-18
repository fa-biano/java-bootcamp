import java.util.Locale;
import java.util.Scanner;

public class AboutMeWithScanner {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Digite seu Nome: ");
      String name = scanner.next();

      System.out.println("Digite seu Sobrenome: ");
      String lastName = scanner.next();

      System.out.println("Digite sua Idade: ");
      int age = scanner.nextInt();

      System.out.println("Digite sua Altura: ");
      double height = scanner.nextDouble();

      System.out.println("Meu nome é " + name + " " + lastName);
      System.out.println("Tenho " + age + " anos");
      System.out.println("E tenho " + height + " metros de altura");
    }
  }
}
