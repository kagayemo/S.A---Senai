public class Aluno {
    
    private String nome;
    private String senha;
    private Cadastro cadastro;
    
    private long matricula;
    private static long ultimaMatricula = 0;


    public Aluno() {
        this.matricula = ++ultimaMatricula;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Cadastro getCadastro() {
        return cadastro;
    }


    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }


    public long getMatricula() {
        return matricula;
    }
    
}






































