import java.util.ArrayList;

public class Cadastro {

    ArrayList<Cursos> listaDeCursos = new ArrayList<Cursos>();

    public void adicionarCurso(Cursos c) {
        this.listaDeCursos.add(c);
    }

//     public void exibirCursosCadastrados(Aluno aluno) {
//         System.out.println("Lista de cursos cadastrados: ");
//         for (Cursos curso : this.listaDeCursos) {
//             if ((aluno.getCadastro().listaDeCursos.contains(curso))) {
//                 String cursosCadastrados = "Nome do curso:" + curso.getNomeCurso() + "\nData:" + curso.getDataHora()
//                         + "\nEndereço:" + curso.getEnderecoCurso();
//                 System.out.println(cursosCadastrados);
//             } else {
//                 System.out.println("Você não fez cadastro em nenhum curso.");
//             }
//         }
//     }
// 
}
