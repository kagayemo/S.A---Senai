import java.util.ArrayList;

public class Escola {
        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
        ArrayList<Cursos> listaDeCursos = new ArrayList<Cursos>();
        //ArrayList<AlunosMatriculados> listaDeAlunosMatriculados = new ArrayList<AlunosMatriculados>();

        public String nomeInstituicao;
        public String codigoInstituicao;
        public String email;
        public String endereco;
        public String senha;

        public String listarAlunos() {
                String alunos = "Alunos matriculados: \n\n";
                for (Aluno aluno : this.listaDeAlunos) {
                        int posicao = listaDeAlunos.indexOf(aluno);
                        alunos += (posicao + 1) + "º Aluno: " + aluno.nome + "\nMatrícula: " + aluno.matricula + "\n";
                }
                return alunos;
        }

        public void adicionarAluno(Aluno a) {
                this.listaDeAlunos.add(a);
        }

        public Aluno removerAluno(int posicaoAluno) {
                return listaDeAlunos.remove(posicaoAluno);

        }
}
