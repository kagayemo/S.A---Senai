import java.util.ArrayList;

public class Escola {
        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

        public String nomeInstituicao;
        public String codigoInstituicao;
        public String email;
        public String endereco;
        public String senha;

        public String listarAlunos() {
                String alunos = "Alunos matriculados: \n\n";
                for (Aluno a : this.listaDeAlunos) {
                        int posicao = listaDeAlunos.indexOf(a);
                        alunos += (posicao + 1) + "º Aluno: " + a.nome + "\nMatrícula: " + a.matricula + "\n";
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
