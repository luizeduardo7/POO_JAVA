public class AlunoGrad extends Aluno{
    private int notaTrab;

    public AlunoGrad(int notaTrab, String nome, int nota, int qtdFalta){
        super(nome, nota, qtdFalta);
        this.notaTrab = notaTrab;
    }

    public int getNotaTrab() {
        return notaTrab;
    }

    public String getSituacao(){
        double media;
        media = (getNotaTrab() + getNota())/2;
        if(media >= 60 && getQtdFalta() < 19){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
