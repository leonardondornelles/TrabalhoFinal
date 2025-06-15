public class CadastroCliente {
    Cliente[] cArr = new Cliente[10];

    Cliente addCliente(int matricula, String nome, String academia, Equipamento dadosEquipamento){
        return new Cliente(matricula, nome, academia, dadosEquipamento);
    }

    // Busca Cliente pelo nome

    ///////


    public void mostrarClientes() {
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != null) {
                System.out.println(i + " - " + cArr[i].getNome());
            }
        }
    }
}
