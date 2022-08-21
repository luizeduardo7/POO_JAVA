import java.util.Scanner;
public class TesteAluno{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String nome, categoria;
        int qtd_disciplinas;

        System.out.print("Digite o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.print("Insira a categoria do aluno (bolsista/nao bolsista): ");
        categoria = entrada.nextLine();


        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        qtd_disciplinas = entrada.nextInt();

        Aluno aluno = new Aluno(nome, categoria, qtd_disciplinas);
        int nota;
        for(int i = 1; i <= qtd_disciplinas; i++){
            System.out.printf("Insira a nota na disciplina %d: ", i);
            nota = entrada.nextInt();
            aluno.set_notas(nota);
        }

        System.out.println("\n############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: %.2f%n", aluno.get_coeficiente());
        System.out.printf("Situação final: %s\n", aluno.get_situacao());

        entrada.close();
    }
}