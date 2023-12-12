public class Principal {
    public static void main(String[] args) {
        Escola e = new Escola();
        // Cadastro c = new Cadastro();

        int opcao = 0;
        int opcaoEscola = 0;
        int opcaoAluno = 0;
        int opcaoCurso = 0;
       
        String loginEscolaCodigo = "";
        String loginEscolaSenha = "";
        String loginAlunoMatricula = "";
        String loginAlunoSenha = "";////////

        LimpaConsole.limparTela();

        do {
            opcao = EntradaSaida.escolherOpcao();
            switch (opcao) {
                case 1:
                    LimpaConsole.limparTela();

                    e.nomeInstituicao = EntradaSaida.recebeDado("o nome da instituição");
                    e.codigoInstituicao = EntradaSaida.recebeDado("o código: ");
                    e.email = EntradaSaida.recebeDado("o email: ");
                    e.endereco = EntradaSaida.recebeDado("o endereço: ");
                    e.senha = EntradaSaida.recebeDado("a senha: ");

                    LimpaConsole.limparTela();
                    // Cadastro da instituição
                    break;
                case 2:
                    // Criar verificação para código da escola
                    LimpaConsole.limparTela();

                    loginEscolaCodigo = EntradaSaida.entrarEscola("o código");
                    loginEscolaSenha = EntradaSaida.entrarEscola("a senha");
                    // Login da instituição

                    if (e.codigoInstituicao.equals(loginEscolaCodigo)
                            && e.senha.equals(loginEscolaSenha)) {

                        LimpaConsole.limparTela();

                        System.out.println("Login realizado com sucesso!");

                        do {
                            opcaoEscola = EntradaSaida.escolherOpcaoEscola();
                            switch (opcaoEscola) {
                                case 1:
                                    Aluno a = new Aluno();// < ISSO TÁ CERTO!!!!!!!!!!!!!!!!

                                    a.nome = EntradaSaida.cadastrarAluno("o nome");
                                    a.matricula = EntradaSaida.cadastrarAluno("a matrícula");
                                    a.senha = EntradaSaida.cadastrarAluno("a senha");
                                    e.adicionarAluno(a);
                                    break;

                                case 2:
                                    
                                    EntradaSaida.mostrarAlunos(e.listarAlunos());
                                    int posicaoAluno = EntradaSaida.solicitaPosicao();
                                    e.removerAluno(posicaoAluno - 1);

                                    break;
                                case 3:

                                    if (!e.listaDeAlunos.isEmpty()) {
                                        EntradaSaida.mostrarAlunos(e.listarAlunos());
                                        // funciona maisomeno :)
                                    } else {

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

                    // System.out.println(c.listaDeAlunos);

                    for (Aluno aluno : e.listaDeAlunos) {
                        if (aluno.matricula.equals(loginAlunoMatricula) && aluno.senha.equals(loginAlunoSenha)) {

                            LimpaConsole.limparTela();

                            System.out.println("Login realizado com sucesso!");

                            do {
                                opcaoAluno = EntradaSaida.escolherOpcaoAluno();
                                switch (opcaoAluno) {
                                    case 1:

                                        opcaoCurso = EntradaSaida.escolherOpcaoCurso();
                                        switch (opcaoCurso) {
                                            case 1:
                                                // Música
                                                break;
                                            case 2:
                                                // Pintura
                                                break;
                                            case 3:
                                                // Dança
                                                break;
                                            case 4:
                                                // Fotografia
                                                break;
                                            case 5:
                                                // Teatro
                                                break;
                                            case 6:
                                                // Escultura
                                                break;
                                            case 7:
                                                // System.exit(0) sair >:(
                                                break;
                                        }

                                        break;

                                    case 2:
                                        break;

                                    case 3:
                                        break;

                                    case 4:
                                        // Sair da conta
                                        break;
                                }
                            } while (opcaoAluno != 4);
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