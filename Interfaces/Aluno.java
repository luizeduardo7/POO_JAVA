public abstract class Aluno implements Comparable<Aluno>{
    private String nome;
    private int nota;
    private int qtdFalta;

    public Aluno(String nome, int nota, int qtdFalta){
        this.nome = nome;
        this.nota = nota;
        this.qtdFalta = qtdFalta;

    }

    public String getNome(){
        return nome;
    }

    public int getNota(){
        return nota;
    }

    public int getQtdFalta(){
        return qtdFalta;
    }

    public abstract String getSituacao();

    @Override
    public int compareTo(Aluno a){
        if(this.nota < a.nota){
            return 1;
        }else if(this.nota > a.nota){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return getNome() +  getNota() + getQtdFalta() + getSituacao();
    }
}
