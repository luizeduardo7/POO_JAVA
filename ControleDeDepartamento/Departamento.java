import java.util.*;
public class Departamento{

    private String nome;
    private String faculdade;
    private ArrayList<Professor> professores;

    public Departamento(String nome, String faculdade){
        this.nome = nome;
        this.faculdade = faculdade;
        professores = new ArrayList<Professor>();
    }

    public void contratarProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void gerarFolhaDePagamento() {
        for(Professor p: professores) {
            System.out.println(p.toString());
        }
    }
}