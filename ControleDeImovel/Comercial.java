import imovel.*;

public class Comercial extends Imovel{
    private String cnpj_proprietario;
    private int duracao_contrato;

    public Comercial(String cnpj_proprietario, int duracao_contrato, String endereco, double valor_aluguel, double taxa_adm){
        super(endereco, valor_aluguel, taxa_adm);
        this.cnpj_proprietario = cnpj_proprietario;
        this.duracao_contrato = duracao_contrato;
    }

    public String getCnpj_proprietario(){
        return cnpj_proprietario;
    }

    public String getTipoImovel(){
        return "Comercial";
    }

    public double calcula_montante(){
        return (getValor_aluguel() * getTaxa_adm()) * (1 - 0.0075 * duracao_contrato);
    }
}
