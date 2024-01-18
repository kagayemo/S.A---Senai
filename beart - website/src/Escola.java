import java.util.ArrayList;

public class Escola {
        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
        ArrayList<Cursos> listaDeCursos = new ArrayList<Cursos>();

        public String nomeInstituicao;
        public String codigoInstituicao;
        public String email;
        public String endereco;
        public String senha;

        //Método que adiciona aluno à lista
        public void adicionarAluno(Aluno a) {
                        this.listaDeAlunos.add(a);
                }
        
        //Método para exibir todos os alunos
        public static void exibirAlunos(Escola escola){
                if (!escola.listaDeAlunos.isEmpty()) {
                        EntradaSaida.mostrarAlunos(escola.listarAlunos());
                    } else {
                        System.out.println("Não há nenhum aluno cadastrado.");
                    }
        }

        //Método para identar a lista de alunos
        public String listarAlunos() {
                String alunos = "Alunos matriculados: \n\n";
                for (Aluno aluno : this.listaDeAlunos) {
                        int posicao = listaDeAlunos.indexOf(aluno);
                        alunos += (posicao + 1) + "º Aluno: " + aluno.getNome()+ "\nMatrícula: " + aluno.getMatricula() + "\n";
                }
                return alunos;
        }
        
        ///////////

        //Método que remove os alunos da lista
        public static void removerAlunos(Escola escola){
                int posicaoAluno = EntradaSaida.solicitaPosicao();

                if (!escola.listaDeAlunos.isEmpty()) {
                    EntradaSaida.mostrarAlunos(escola.listarAlunos());
                    escola.removerAluno(posicaoAluno - 1);
                } else {
                    System.out.println("Não há alunos cadastrados.");
                }
        }

        //Método para remover o aluno da lista através da posição
        public Aluno removerAluno(int posicaoAluno) {
                return listaDeAlunos.remove(posicaoAluno);
        }
}

