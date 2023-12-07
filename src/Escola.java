import java.util.ArrayList;

public class Escola {
        public String nomeInstituicao;
        public String codigoInstituicao;
        public String email;
        public String endereco;
        public String senha;

        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

        public void adicionarAluno(Aluno a) {
                this.listaDeAlunos.add(a);
        }

        public String listarAlunos() {
                String alunos = "Os alunos são: \n\n";
                for (Aluno a : this.listaDeAlunos) {
                        int posicao = listaDeAlunos.indexOf(a);
                        alunos += (posicao + 1) + "º Aluno: " + a.nome + "\nMatrícula: " + a.matricula + "\n";
                }
                return alunos;
        }
}
