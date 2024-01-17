import java.util.ArrayList;

public class Cadastro {

    public ArrayList<Cursos> listaDeCursos = new ArrayList<Cursos>();
        return aluno.getCursos();

    public adicionarCurso(Cursos c) {
        this.listaDeCursos.add(c);
    }

    // public void exibirCursosCadastrados(Aluno aluno) {
    //     System.out.println("Lista de cursos cadastrados: ");
    //     for (Cursos curso : this.listaDeCursos) {
    //         if ((aluno.getCadastro().listaDeCursos.contains(curso))) {
    //             String cursosCadastrados = "Nome do curso:" + curso.getNomeCurso() + "\nData:" + curso.getDataHora()
    //                     + "\nEndereço:" + curso.getEnderecoCurso();
    //             System.out.println(cursosCadastrados);
    //         } else {
    //             System.out.println("Você não fez cadastro em nenhum curso.");
    //         }
    //    }
    public static void exibirCursosCadastrados(Aluno aluno) {
    if (aluno.getCursos().isEmpty()) {
        System.out.println("Nenhum curso encontrado!");
    } else {
        System.out.println("Cursos encontrados:");
        for (Cursos curso : aluno.getCursos()) {
            System.out.println(curso.getNomeCurso());
        }
    }
}
    }
