public class Professor{
    
    private String nome;
    private String cpf;

    public Professor(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nSalario = R$ " +
        String.format("%.2f%n", calcularSalario());
    }

    public double calcularSalario(){
        return 0;
    }
}