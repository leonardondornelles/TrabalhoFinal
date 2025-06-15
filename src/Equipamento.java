public class Equipamento {
    private int codigo;
    private String nome;
    private String tipo; // barra, kettlebell ou corda naval
    private int quantDispLocacao;
    private double valorBaseLocacao;
    private double valorAluguel; // por 1 semana, 15 dias ou 1 mês (com 5% de desconto para 15 dias e 10% para 1 mês)
    private boolean seguro; // se for contratado, acrescenta 2% ao valor total

    public Equipamento(int codigo, String nome, String tipo, int quantDispLocacao, double valorBaseLocacao)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.quantDispLocacao = quantDispLocacao;
        this.valorBaseLocacao = valorBaseLocacao;
        //this.valorAluguel = valorAluguel;
    }
    
    
    public int getCodigo()
    {
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }

     public int getQuantDispLocacao()
    {
        return quantDispLocacao;
    }

    public double getValorBaseLocacao()
    {
        return valorBaseLocacao;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantDispLocacao(int quantDispLocacao) {
        this.quantDispLocacao = quantDispLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String toString() {
        return "Equipamento { Código: " + codigo + " | Nome: " + nome + " | Tipo: " + tipo
                + " | Quantidade Disponível: " + quantDispLocacao + " | Valor base locação: " + valorBaseLocacao + " } ";
    }

    public void retirar() {
        if(quantDispLocacao > 0) {
            quantDispLocacao--;
            System.out.println("Nova quantidade disponivel: " + quantDispLocacao);
        } else {
            System.out.println("Estamos sem estoque deste equipamento");
        }
    }

    public void devolver() {
        quantDispLocacao++;
        System.out.println("Nova quantidade disponivel: " + quantDispLocacao);
    }


    public double calcValorLocacao(int dias, boolean seguro) {
        double valor = valorBaseLocacao;

        if (dias == 15) {
            valor = valor * 0.95;
        } else if (dias == 30) {
            valor = valor * 0.9;
        }

        if (seguro) {
            valor = valor * 1.02;
        }

        return valor;
    }
}
