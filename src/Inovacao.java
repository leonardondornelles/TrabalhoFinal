public class Inovacao{  
    CadastroCliente cCliente = new CadastroCliente();
    CadastroEquipamento cEquipamento = new CadastroEquipamento();

    public void maiorDemanda(){
        for(int i = 0; i < cCliente.cArr.length; i++)
        {
            cCliente.cArr[i].getDadosEquipamento().getCodigo();
            int equipamentomais = cEquipamento.eArr[0].getCountTotal();
            for(int j = 1;j < cEquipamento.eArr.length; j++) {
                if (cEquipamento.eArr[j].getCountTotal() > equipamentomais)
                    equipamentomais = earr[i]
            }
            
            coutn1++;
        }

}