public class Principal {
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        int opcao = 0;
        int opcaoEscola = 0;
        String loginEscolaCodigo = "";
        String loginEscolaSenha = "";

        LimpaConsole.limparTela();

        do {
            opcao = EntradaSaida.escolherOpcao();
            switch (opcao) {
                case 1:
                    Escola e = new Escola();
                    LimpaConsole.limparTela();
                    e.nomeInstituicao = EntradaSaida.recebeDado("o nome");
                    e.codigoInstituicao = EntradaSaida.recebeDado("o código: ");
                    e.email = EntradaSaida.recebeDado("o email: ");
                    e.endereco = EntradaSaida.recebeDado("o endereço: ");
                    e.senha = EntradaSaida.recebeDado("a senha: ");
                    c.adicionarEscola(e);

                    LimpaConsole.limparTela();
                    // Cadastro da instituição
                    break;
                case 2:
                    // Criar verificação para código da escola
                    LimpaConsole.limparTela();

                    loginEscolaCodigo = EntradaSaida.entrarEscola("o código");
                    loginEscolaSenha = EntradaSaida.entrarEscola("a senha");
                    e = c.logarConta(loginEscolaCodigo, loginEscolaSenha);

                    // Login da instituição
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

                                    // Remover um aluno
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
                                    EntradaSaida.escolherOpcao();
                                    break;
                            }
                        } while (opcaoEscola != 4);
                        

                    break;

                case 3:

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
// why god why god do i got to suffe