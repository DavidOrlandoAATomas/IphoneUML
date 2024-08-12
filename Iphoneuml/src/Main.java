import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        operar();
    }
        public static void operar(){
            AparelhoTelefonico at = new AparelhoTelefonico();
            ReproduzirMusica rm = new ReproduzirMusica();
            NavegadorInternet ni = new NavegadorInternet();
            System.out.println("Funcionalidades do Iphone, selecione uma!");
            System.out.println("1. Reproduzir Música\n2. Aparelho telefônico\n3. Navegador\n4. Fechar");
            Scanner ler = new Scanner(System.in);
            int op = ler.nextInt();

            while (true) {
                if (op == 2) {
                    System.out.println("Ações disponíveis:\n1.Tocar\n2.Atender\n3.Correio de Voz\n4.Voltar");
                    System.out.println("Sua opção:");
                    int op1 = ler.nextInt();
                    if (op1 == 1) {
                        System.out.println("Numero que pretende ligar:");
                        String numero = ler.next();
                        at.ligar(numero);
                    } else if (op1 == 2) {
                        at.atender();

                    } else if (op1 == 3) {
                        at.IniciarCorreioVoz();

                    } else {
                        operar();
                    }
                } else if (op == 1) {
                    System.out.println("Ações disponíveis:\n1.Tocar\n2.Pausar\n3.Selecionar\n4.Voltar");
                    System.out.println("Sua opção:");
                    int op2 = ler.nextInt();
                    if (op2 == 1) {
                        rm.tocar();
                        operar();
                    } else if (op2 == 2) {
                        rm.pausar();

                    } else if (op2 == 3){
                        System.out.println("Digite o nome da música:");
                        String musica = ler.next();
                        rm.SelecionarMusica(musica);

                    }else
                        operar();
                } else if (op == 3) {
                    System.out.println("Ações disponíveis:\n1.Exibir Página\n2.Adicionar nova aba\n3.Atualizar página\n4.Voltar");
                    System.out.println("Sua opção:");
                    int op3 = ler.nextInt();
                    if (op3 == 1) {
                        System.out.println("Digite a url da página:");
                        String url = ler.next();
                        ni.ExibirPagina(url);

                    } else if (op3 == 2) {
                        ni.AdicionarNovaAba();

                    } else if (op3 == 3) {
                        System.out.println("Digite a url da página:");
                        String url = ler.next();
                        ni.AtualizarPagina(url);
                        ni.ExibirPagina(url);

                    }else
                        operar();
                } else if (op == 4)
                    break;
                    System.exit(4);

            }
        }
    }