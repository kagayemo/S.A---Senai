import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Cursos> cursos = Cursos.inicializaCursos(); 
        Escola escola = new Escola();

        int opcao = 0;
        int opcaoEscola = 0;
        int opcaoAluno = 0;
        //int opcaoCurso = 0;

        String loginEscolaCodigo = "";
        String loginEscolaSenha = "";
        String loginAlunoMatricula = "";
        String loginAlunoSenha = "";

        LimpaConsole.limparTela();

        do {
            opcao = EntradaSaida.escolherOpcao();
            switch (opcao) {
                case 1:
                    LimpaConsole.limparTela();

                    escola.nomeInstituicao = EntradaSaida.recebeDado("o nome da instituição");
                    escola.codigoInstituicao = EntradaSaida.recebeDado("o código: ");
                    escola.email = EntradaSaida.recebeDado("o email: ");
                    escola.endereco = EntradaSaida.recebeDado("o endereço: ");
                    escola.senha = EntradaSaida.recebeDado("a senha: ");

                    LimpaConsole.limparTela();
                    // Cadastro da instituição
                    break;
                case 2:
                    // Criar verificação para código da escola
                    LimpaConsole.limparTela();

                    loginEscolaCodigo = EntradaSaida.entrarEscola("o código");
                    loginEscolaSenha = EntradaSaida.entrarEscola("a senha");
                    // Login da instituição

                    if (escola.codigoInstituicao.equals(loginEscolaCodigo)
                            && escola.senha.equals(loginEscolaSenha)) {

                        LimpaConsole.limparTela();

                        System.out.println("Login realizado com sucesso!");

                        do {
                            opcaoEscola = EntradaSaida.escolherOpcaoEscola();
                            switch (opcaoEscola) {
                                case 1:
                                    Aluno aluno = new Aluno();// < ISSO TÁ CERTO!!!!!!!!!!!!!!!!
                                    aluno.setCadastro(new Cadastro()); // Cadastro passa a fazer parte do aluno
                                    aluno.setNome(EntradaSaida.cadastrarAluno("o nome"));
                                    aluno.setSenha(EntradaSaida.cadastrarAluno("a senha"));
                                    escola.adicionarAluno(aluno);
                                    break;

                                case 2:
                                    int posicaoAluno = EntradaSaida.solicitaPosicao();
                                    
                                    if (!escola.listaDeAlunos.isEmpty()) {
                                        EntradaSaida.mostrarAlunos(escola.listarAlunos());
                                        escola.removerAluno(posicaoAluno - 1);
                                    } else {
                                        System.out.println("Não há alunos cadastrados.");
                                    }
                                    break;

                                case 3:

                                    if (!escola.listaDeAlunos.isEmpty())

                                    {
                                        EntradaSaida.mostrarAlunos(escola.listarAlunos());

                                    } else

                                    {
                                        System.out.println("Não há nenhum aluno cadastrado.");

                                    }

                                    break;

                                case 4:
                                    // Sair da conta
                                    break;
                            }
                        } while (opcaoEscola != 4);
                    } else {
                        System.out.println("Usuário ou senha incorretos! Tente novamente");
                    }
                    break;

                case 3:
                    loginAlunoMatricula = EntradaSaida.entrarAluno(" a matrícula ");
                    loginAlunoSenha = EntradaSaida.entrarAluno(" a senha ");

                    for (Aluno aluno : escola.listaDeAlunos) {
                        if (aluno.getMatricula() == Long.parseLong(loginAlunoMatricula) && aluno.getSenha().equals(loginAlunoSenha)) {

                            LimpaConsole.limparTela();

                            System.out.println("Login realizado com sucesso!");

                            do {
                                opcaoAluno = EntradaSaida.escolherOpcaoAluno();
                                switch (opcaoAluno) {
                                    case 1:
                                        EntradaSaida.realizaMatricula(cursos, aluno);                                   
                                    break;

                                    case 2:
                                        Cadastro.exibirCursosCadastrados();

                                    break;
                                    case 3:
                                        break;
                                }
                            } while (opcaoAluno != 3);
                        } else {
                            System.out.println("Usuário ou senha incorretos! Tente novamente");
                        }
                    }
                    break;

                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        } while (opcao != 6);

    }
}

// everybody gon' respect de shooter, but the one in the front of the gun lives
// forever.
// why god why god do i got to suffer
