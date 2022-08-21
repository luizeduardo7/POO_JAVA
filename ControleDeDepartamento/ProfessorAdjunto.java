public class ProfessorAdjunto extends Professor{
    double gratificacaoTitulacao;
    double salarioBase;

    public ProfessorAdjunto(String nome, String cpf, double gratificacaoTitulacao, double salarioBase){
        super(nome, cpf);
        this.gratificacaoTitulacao = gratificacaoTitulacao;
        this.salarioBase = salarioBase;
    }

    public double getGratificacaoTitulacao(){
        return gratificacaoTitulacao;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularSalario(){
        double resultado;
        resultado = gratificacaoTitulacao + salarioBase;
        resultado *= 1.3; 
        return resultado;
    }
}