import java.util.Scanner;

public class Aluguel {

    public static void menu(CadastroCliente cCliente, CadastroEquipamento cEquipamento){
        Scanner cin = new Scanner(System.in);
        
        // Equipamento equipamento = new Equipamento(0, null, null, 0, 0);
        int option;

        do {
            System.out.println("1 - Incluir Cliente");
            System.out.println("2 - Mostrar clientes cadastrados");
            System.out.println("3 - Pesquisar cliente por nome");
            System.out.println("4 - Incluir equipamento");
            System.out.println("5 - Mostrar equipamentos");
            System.out.println("6 - Pesquisar equipamento por nome");
            System.out.println("7 - Retirar Equipamento");
            System.out.println("8 - Devolver Equipamento");
            System.out.println("9 - Mostrar quantidade total de equipamentos disponíveis");
            System.out.println("10 - ???????");
            System.out.println("11 - Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");

            option = cin.nextInt();
            cin.nextLine();

            switch (option) {
                case 1:
                    // Incluir cliente
                    for (int i = 0; i < cCliente.cArr.length; i++) {
                        if (cCliente.cArr[i] == null) {
                            cCliente.cArr[i] = cCliente.addCliente();
                            System.out.println("Cliente adicionado com sucesso na pos " + i);
                            System.out.println("Cliente:" + cCliente.cArr[i].getNome());
                            System.out.println();
                        
                            break;
                            // return;
                        }
                        else if (i == cCliente.cArr.length - 1) {
                            System.out.println("Não há mais espaço para adicionar clientes.");
                        }
                    }
                   // System.out.println("Não há mais espaço para adicionar clientes.");
                    break;
                case 2:
                    // Mostrar clientes
                    cCliente.mostrarClientes();
                    break;
                case 3:
                    cCliente.buscarClientePeloNome();
                    // Pesquisar cliente por nome
                    break;
                case 4:
                    // Incluir Equipamento
                    for (int i = 0; i < cEquipamento.eArr.length; i++) {
                        if (cEquipamento.eArr[i] == null) {
                            cEquipamento.eArr[i] = cEquipamento.addEquipamento(i + 1);
                            System.out.println("Equipamento adicionado com sucesso na pos " + i);
                            System.out.println("Equipamento:" + cEquipamento.eArr[i].getNome());
                            System.out.println();
                        
                            break;
                        }
                        else if (i == cEquipamento.eArr.length - 1) {
                            System.out.println("Não há mais espaço para adicionar equipamentos.");
                        }
                    }
                    break;
                case 5:
                    // Mostrar equipamentos
                    cEquipamento.mostrarEquipamentos();
                    break;
                case 6:
                    // Pesquisar equipamento por nome
                    cEquipamento.buscaEquipPeloNome();
                    break;
                case 7:

                    // arrumar
                    
                    // Retirar equipamento
                    break;
                case 8:

                    // equipamento.devolver();
                    
                    // Devolver equipamento
                    break;
                case 9:
                    cEquipamento.totalEquipamentos();
                    // Mostrar quantidade total de equipamentos disponiveis
                    break;
                case 10:
                    // Inovaçao
                    break;
                case 11:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Por favor digite uma opção válida.");
                    break;
            }
        } while (option != 11);

        // cin.close();
    }
    
    public static void main(String[] args)
    {
        CadastroCliente cCliente = new CadastroCliente();
        CadastroEquipamento cEquipamento = new CadastroEquipamento();

        menu(cCliente, cEquipamento);

    }
}
