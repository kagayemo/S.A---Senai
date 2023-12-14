import java.util.ArrayList;

public class Cadastro {

    ArrayList<Materiais> listaDeMateriais = new ArrayList<Materiais>();
    ArrayList<Cursos> listaDeCursos = new ArrayList<Cursos>();

    public String listarCursos() {

        String exibirCursos = "Cursos disponíveis: \n\n";
        for (Cursos curso : this.listaDeCursos) {
            int posicao = listaDeCursos.indexOf(curso);
            exibirCursos += (posicao + 1) + " "+ curso.nomeCurso + "\n" + curso.descricao + "\n" + curso.professor + "\n" + curso.enderecoCurso + "\n" + curso.dataHora;
        }
        return exibirCursos;
    }

    public void adicionarCurso(Cursos c) {
        this.listaDeCursos.add(c);
    }

}