package imovel;

public class Imovel{
    private String endereco;
    private double valor_aluguel;
    private double taxa_adm;

    public Imovel(String endereco, double valor_aluguel, double taxa_adm){
        this.endereco = endereco;
        this.valor_aluguel = valor_aluguel;
        this.taxa_adm = taxa_adm;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor_aluguel(){
        return valor_aluguel;
    }

    public double getTaxa_adm(){
        return taxa_adm;
    }

    public String getTipoImovel(){
        return "";
    }

    public double calcula_montante(){
        return 0;
    }

    @Override
    public String toString() {
        return "Tipo do Imóvel: " + getTipoImovel() + "\nEndereco: " + getEndereco() + "\nValor de Adm (R$): " +
        String.format("%.2f%n", calcula_montante());
    }

}