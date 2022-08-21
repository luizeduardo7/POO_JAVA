import java.util.*;

public class Diario{
    private ArrayList<Aluno> alunos;

    public Diario(){
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);
    }

    public void gerarDiarioTurma(){
        Collections.sort(alunos);
        System.out.println("Nome    " + "Nota Prova    " + "Faltas    " + "Situação    ");
        for(Aluno a : alunos){
            System.out.println(a);
        }
    }

}