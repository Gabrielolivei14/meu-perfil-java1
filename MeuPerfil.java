import java.util.Scanner;

public class MeuPerfil {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        scanner.nextLine(); 
      
        System.out.print("Digite o seu hobbie: ");
        String hobbie = scanner.nextLine();

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Hobbie: " + hobbie);

       
        scanner.close();
    }
}
