import imovel.*;

public class Residencial extends Imovel{
    private String cpf_proprietario;
    private String categoria;

    public Residencial(String cpf_proprietario, String categoria, String endereco, double valor_aluguel, double taxa_adm){
        super(endereco, valor_aluguel, taxa_adm);
        this.cpf_proprietario = cpf_proprietario;
        this.categoria = categoria;
    }

    public String getCpf_proprietario(){
        return cpf_proprietario;
    }

    public String getTipoImovel(){
        return "Residencial";
    }

    public double calcula_montante(){
        if(categoria.equals("local")){
            return (getValor_aluguel() * getTaxa_adm()) + 50.0;
        }else if(categoria.equals("regional")){
            return (getValor_aluguel() * getTaxa_adm()) + 100.0;
        }else{
            return -1;
        }
    }
}
