public class ProfessorAssistente extends Professor{
    int horasTabalhadasSemana;
    double gratificacaoAtividadeExtra;

    public ProfessorAssistente(String nome, String cpf, int horasTabalhadasSemana, double gratificacaoAtividadeExtra){
        super(nome, cpf);
        this.horasTabalhadasSemana = horasTabalhadasSemana;
        this.gratificacaoAtividadeExtra = gratificacaoAtividadeExtra;
    }

    public double getGratificacaoAtividadeExtra(){
        return gratificacaoAtividadeExtra;
    }

    public int getHorasTrabalhadas(){
        return horasTabalhadasSemana;
    }

    public double calcularSalario(){
        double resultado;
        resultado = (horasTabalhadasSemana * 100);
        resultado += gratificacaoAtividadeExtra;
        return resultado;
    }
}