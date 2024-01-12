public class Principal {
    public static void main(String[] args) {

        Escola escola = new Escola();
        Cursos cursos = new Cursos();
        Cadastro cadastro = new Cadastro();

        int opcao = 0;
        int opcaoEscola = 0;
        int opcaoAluno = 0;
        int opcaoCurso = 0;
        int opcaoMatricula = 0;

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
                                LimpaConsole.limparTela();

                                    Aluno aluno = new Aluno();// < ISSO TÁ CERTO!!!!!!!!!!!!!!!!

                                    aluno.nome = EntradaSaida.cadastrarAluno("o nome");
                                    aluno.matricula = EntradaSaida.cadastrarAluno("a matrícula");
                                    aluno.senha = EntradaSaida.cadastrarAluno("a senha");
                                    escola.adicionarAluno(aluno);
                                    break;

                                case 2:
                                LimpaConsole.limparTela();

                                EntradaSaida.mostrarAlunos(escola.listarAlunos());
                                    int posicaoAluno = EntradaSaida.solicitaPosicao();
                                    
                                    if (!escola.listaDeAlunos.isEmpty()) {
                                        escola.removerAluno(posicaoAluno - 1);
                                        System.out.println("Aluno removido com sucesso!");
                                    } else {
                                        System.out.println("Não há alunos cadastrados.");
                                    }
                                    break;

                                case 3:
                                LimpaConsole.limparTela();

                                    if (!escola.listaDeAlunos.isEmpty())

                                    {
                                        EntradaSaida.mostrarAlunos(escola.listarAlunos());

                                    } else

                                    {
                                        System.out.println("Não há nenhum aluno cadastrado.");

                                    }

                                    break;

                                case 4:
                                LimpaConsole.limparTela();
                                    // Sair da conta
                                    break;
                            }
                        } while (opcaoEscola != 4);
                    } else {
                        System.out.println("Usuário ou senha incorretos! Tente novamente");
                    }
                    break;

                case 3:
                LimpaConsole.limparTela();

                    loginAlunoMatricula = EntradaSaida.entrarAluno(" a matrícula ");
                    loginAlunoSenha = EntradaSaida.entrarAluno(" a senha ");

                    // System.out.println(c.listaDeAlunos);

                    for (Aluno aluno : escola.listaDeAlunos) {
                        if (aluno.matricula.equals(loginAlunoMatricula) && aluno.senha.equals(loginAlunoSenha)) {

                            LimpaConsole.limparTela();

                            System.out.println("Login realizado com sucesso!");

                            do {
                                opcaoAluno = EntradaSaida.escolherOpcaoAluno();
                                switch (opcaoAluno) {
                                    case 1:
                                    LimpaConsole.limparTela();
                                        do {

                                            EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                            opcaoCurso = EntradaSaida.escolherOpcaoCurso();
                                            switch (opcaoCurso) {
                                                
                                                case 1:
                                                
                                                    cursos.nomeCurso = "Guitarra\n";
                                                    cursos.descricao = " Descrição: O aluno aprenderá bases de rock, blues, jazz, entre outros estilos dependendo de sua preferência musical\n";
                                                    cursos.professor = " Professor: Thomas Baptist Morello\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC\n";
                                                    cursos.dataHora = "Data: 20/05/2024 - 14:30pm\n";
                                                    cadastro.adicionarCurso(cursos);

                                                    cadastro.listarCursos();
                                                    do {
                                                        opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();
                                                        switch (opcaoMatricula) {
                                                            case 1:

                                                                break;

                                                            case 2:
                                                                break;
                                                        }
                                                    } while (opcaoMatricula != 2);

                                                    break;

                                                case 2:

                                                    cursos.nomeCurso = "Técnicas de pintura\n";
                                                    cursos.descricao = "Descrição: O aluno irá aprender desde o básico, como teoria das cores até técnicas de pintura à óleo, acrílica e afins\n";
                                                    cursos.professor = "Professor: Leonardo da Vinci\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC, 89221-006\n";
                                                    cursos.dataHora = "Data: 17/01/2024 - 14:30pm";
                                                    cadastro.adicionarCurso(cursos);
                                                
                                                    EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                                do {
                                                    opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();

                                                    switch (opcaoMatricula) {
                                                        case 1:

                                                            break;

                                                        case 2:
                                                            break;
                                                    }
                                                }while (opcaoMatricula != 2);

                                                break;
                                        

                                                case 3:

                                                    cursos.nomeCurso = "Danças urbanas\n";
                                                    cursos.descricao = "Descrição: O aluno terá uma introdução em técnicas de dança e poderá explorar diversos aspectos da dança de rua\n";
                                                    cursos.professor = "Professor: Kwon Soon-young\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC, 89221-006\n";
                                                    cursos.dataHora = "Data: 12/06/2024 - 13:30pm";
                                                    cadastro.adicionarCurso(cursos);

                                                    EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                                    do {
                                                        opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();
                                                        switch (opcaoMatricula) {
                                                        case 1:
                                                        

                                                            break;

                                                        case 2:
                                                            break;
                                                        }
                                                    }while (opcaoMatricula != 2);
                                                    break;

                                                case 4:

                                                    cursos.nomeCurso = "Fotografia digital\n";
                                                    cursos.descricao = "Descrição: Os alunos do curso passam por aulas teóricas, de forma prática e criativa para produzir imagens que contem histórias e técnica \n";
                                                    cursos.professor = "Professor: Araquém Alcântara\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC, 89221-006\n";
                                                    cursos.dataHora = "Data: 17/03/2024 - 15:00pm";
                                                    cadastro.adicionarCurso(cursos);

                                                    EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                                    do {
                                                        opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();
                                                        switch (opcaoMatricula) {
                                                        case 1:
                                                        

                                                            break;

                                                        case 2:
                                                            break;
                                                        }
                                                    }while (opcaoMatricula != 2);
                                                    break;
                                                case 5:

                                                    cursos.nomeCurso = "Artes cênicas\n";
                                                    cursos.descricao = "Descrição: O aluno irá aprender desde o básico conceitos de expressões artísticas, oferecendo noções de interpretação e improvisação de forma teórica \n";
                                                    cursos.professor = "Professores: William Shakespeare e Fernanda Montenegro\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC, 89221-006\n";
                                                    cursos.dataHora = "Data: 29/02/2024 - 15:30pm";
                                                    cadastro.adicionarCurso(cursos);

                                                    EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                                    do {
                                                        opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();
                                                        switch (opcaoMatricula) {
                                                        case 1:
                                                        

                                                            break;

                                                        case 2:
                                                            break;
                                                        }
                                                    }while (opcaoMatricula != 2);
                                                    break;

                                                case 6:

                                                    cursos.nomeCurso = "Modelagem em clay\n";
                                                    cursos.descricao = "Descrição: O aluno irá aprender diversas abordagens e tipos diferentes de massas para a criação de escultura, além de oferecer liberdade artística ao estudante \n";
                                                    cursos.professor = "Professor: Michelangelo di Lodovico Buonarroti Simoni\n";
                                                    cursos.enderecoCurso = "Endereço: R. Dona Francisca, 800 - Saguaçu, Joinville - SC, 89221-006\n";
                                                    cursos.dataHora = "Data: 10/06/2024 - 14:30pm";
                                                    cadastro.adicionarCurso(cursos);

                                                    EntradaSaida.mostrarCursos(cadastro.listarCursos());
                                                    do {
                                                        opcaoMatricula = EntradaSaida.escolherOpcaoMatricula();
                                                        switch (opcaoMatricula) {
                                                        case 1:
                                                        

                                                            break;

                                                        case 2:
                                                            break;
                                                        }
                                                    }while (opcaoMatricula != 2);
                                                    break;

                                                case 7:
                                                    // System.exit(0) sair >:(
                                                    break;

                                            }

                                            break;
                                        } while (opcaoCurso != 7);

                                    case 2:
                                        break;

                                    case 3:
                                        break;

                                }
                                
                         LimpaConsole.limparTela();
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
