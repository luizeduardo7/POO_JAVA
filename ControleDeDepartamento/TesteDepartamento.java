public class TesteDepartamento{
    public static void main(String[] args){
        //Departamento: Ciencia da Computacao / Faculdade: Informatica
        Departamento depto = new Departamento("Ciencia da Computacao","Informatica");
        Professor prof1 = new ProfessorAdjunto("Luiz","123456789-10",3000.00,2500.00);
        Professor prof2 = new ProfessorAssistente("José", "987654321-00", 40, 1500.00);
        depto.contratarProfessor(prof1);
        depto.contratarProfessor(prof2);
        depto.gerarFolhaDePagamento();
    }
}