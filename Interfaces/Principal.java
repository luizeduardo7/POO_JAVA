public class Principal {
    public static void main(String[] args){
    Diario diario = new Diario();
    Aluno a;
    a = new AlunoGrad(90,"Jose",85,12);
    diario.adicionarAluno(a);
    a = new AlunoGrad(65,"Pedro",45,10);
    diario.adicionarAluno(a);
    a = new AlunoPos(3,"Regina",75,15);
    diario.adicionarAluno(a);
    diario.gerarDiarioTurma();
    }
}
