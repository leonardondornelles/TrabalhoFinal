import java.util.Random;
import java.util.Scanner;

public class CadastroCliente {
    // Array clientes
    Cliente[] cArr;

    public CadastroCliente() {
        cArr = new Cliente[10];
        //cArr[1] = new Cliente(421421, "Nicolas ", "Academia2", null);
    }
    
    Scanner teclado = new Scanner(System.in);

    // public Cliente addCliente(int matricula, String nome, String academia, Equipamento dadosEquipamento){
    //     System.out.print("Insira o nome do cliente: ");
    //     String nomeCliente = teclado.next();
    //     System.out.println();
    //     System.out.print("Insira a academia do cliente: ");
    //     String academiaCliente = teclado.next();
    //     System.out.println();

    //     return new Cliente(matricula, nomeCliente, academiaCliente, dadosEquipamento);
    // }

    public Cliente addCliente(){
        CadastroEquipamento cEquipamento = new CadastroEquipamento();
        int matriculaCliente = new Random().nextInt(10000); // Corrigido: instanciar Random
        
        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.println("{"+ nomeCliente +"}");
        System.out.println();
        System.out.print("Insira a academia do cliente: ");
        String academiaCliente = teclado.nextLine();
        System.out.println();
        System.out.print("Insira o Codigo do Equipamento Alugado/Vendido: ");
        int codigoEquipamento = teclado.nextInt();
        teclado.nextLine();

        Equipamento equipamento = cEquipamento.buscaEquipPeloCodigo(codigoEquipamento); // Busca o equipamento desejado pelo código
        if(equipamento != null) // verifica se o código do equipamento existe
        {
            if(equipamento.getQuantDispLocacao() > 1) // Verifica se ainda há uma quantidade disponível no estoque
            {
                System.out.println("Quantidade disponível para locação "+equipamento.getQuantDispLocacao()); // Printa a quantidade
                System.out.print("Quantos equipamentos você deseja alugar?");
                equipamento.retirar();
            }
            else{
                System.out.println("O equipamento desejado está fora de estoque.");
            }
        }
        //cEquipamento.removeEquipamento(codigoEquipamento); // Remove o equipamento do estoque

        return new Cliente(matriculaCliente, nomeCliente, academiaCliente, equipamento);
    }


    // Busca Cliente pelo nome
    public String buscarClientePeloNome() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = teclado.nextLine();

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != null && cArr[i].getNome().equalsIgnoreCase(nomeCliente)) {
                System.out.println("Cliente encontrado: " + cArr[i].toString());
                //return cArr[i].toString();
            }
            else if (cArr[i] == null) {
                continue; // Se o cliente não existir, continua para o próximo
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }


    public void mostrarClientes() {
        int countClientes = 0;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != null) {
                countClientes++;
                System.out.println(i + " - " + cArr[i].toString());
                System.out.println("---------------------------");
            }
        }
        if(countClientes == 0)
        {
            System.out.println("Não há nenhum cliente cadastrado");
        }
        System.out.println("Total de clientes cadastrados: "+countClientes);
    }
}
