class Aluno{
    private String nome;
    private String categoria;
    private int[] notas;
    private int cont;
    
    public Aluno(String nome_aluno, String categoria_aluno, int n){
        nome = nome_aluno;
        categoria = categoria_aluno;
        notas = new int[n];
        cont = 0;
    }

    public String get_nome(){
        return nome;
    }

    public int get_nota(int n){
        return notas[n];
    }

    public float get_coeficiente(){
        float resultado = 0;
        for(int i = 0; i < notas.length; i++){
            resultado += get_nota(i);
        }
        resultado /= notas.length;
        return resultado;
    }

    public String get_situacao(){
        String situacao = "-";
        if(categoria.equals("bolsista")){
            if(get_coeficiente() >= 75.00){
                situacao = "regular";
            }else if(get_coeficiente() < 75.00){
                situacao = "desligado";
            }
        }else if(categoria.equals("não bolsista")){
            if(get_coeficiente() >= 70.00){
                situacao = "regular";
            }else if(get_coeficiente() < 70.00){
                situacao = "desligado";
            }
        }
        return situacao;
    }

    public void set_notas(int nota){
        notas[cont] = nota;
        cont++;
    }
}
