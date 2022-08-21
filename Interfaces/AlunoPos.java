public class AlunoPos extends Aluno{
    private int qtdSeminario;

    public AlunoPos(int qtdSeminario, String nome, int nota, int qtdFalta){
        super(nome, nota, qtdFalta);
        this.qtdSeminario = qtdSeminario;
    }
    
    public int getQtdSeminario() {
        return qtdSeminario;
    }

    public String getSituacao(){
        if(getQtdSeminario() >= 2 && getNota() >= 70 && getQtdFalta() <= 15){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
