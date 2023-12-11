import java.util.ArrayList;

public class Cadastro {
    ArrayList<Escola> listaDeEscolas = new ArrayList<Escola>();
    ArrayList<Materiais> listaDeMateriais = new ArrayList<Materiais>();
    ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();

    ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    public void adicionarEscola(Escola e) {
        listaDeEscolas.add(e);

    }

    public void adicionarAluno(Aluno a) {
        this.listaDeAlunos.add(a);
    }

}
