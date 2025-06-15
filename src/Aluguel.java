import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args)
    {
        System.out.println("\f");

        Scanner teclado = new Scanner(System.in);

        int escolha = teclado.nextInt();

        System.out.println("Incluir Cliente - 1");
        System.out.println("Mostrar clientes cadastrados - 2");
        System.out.println("Pesquisar cliente por nome - 3");
        System.out.println("Incluir equipamento - 4");
        System.out.println("Mostrar equipamentos - 5");
        System.out.println("Pesquisar equipamento por nome - 6");
        System.out.println("Retirar equipamento - 7");
        System.out.println("Devolver equipamento - 8");
        System.out.println("Mostrar quantidade total de equipamentos disponíveis - 9");
        System.out.println("Inovação - 10");
        System.out.println("Sair do Programa - 11");

        switch (escolha) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
