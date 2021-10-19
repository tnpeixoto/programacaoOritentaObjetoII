/*
União Metropolitana de Educação e Cultura
Bacharelado em Sistemas de Informação
Programação Orientada a Objetos II
Prof. Pablo Ricardo Roxo Silva
Tiago Nogueira Peixoto
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void menu(){
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("\tCadastro de ações");
        System.out.println("1. Incluir");
        System.out.println("2. Listar");
        System.out.println("3. Pesquisar");
        System.out.println("0. Sair");
        System.out.println("       -------------------------------------------------------------------");
        System.out.print("Opcao: ");
    }
    public static void menu2(){
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("\tConfiguração da ação");
        System.out.println("1. Edita");
        System.out.println("2. Excluir");
        System.out.println("0. Voltar ao menu anterior");
        System.out.println("       -------------------------------------------------------------------");
        System.out.print("Opcao: ");
    }
    public static void menu3(){
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("\tDigite qual atributo deseja modificar");
        System.out.println("1. Nome da Açao");
        System.out.println("2. Cotação da Ação");
        System.out.println("3. Preço por Lucro da Ação");
        System.out.println("0. Voltar ao menu anterior");
        System.out.println("       -------------------------------------------------------------------");
        System.out.print("Opcao: ");
    }

    public static void main(String[] args) {
        int opcaoMenu1,opcaoMenu2, opcaoMenu3;
        Scanner ler = new Scanner(System.in);
        ArrayList<Acao> listaAcoes = new ArrayList<>();
        String nome;
        Double ctc, pl;

        do{
            menu();
            opcaoMenu1 = ler.nextInt();
            switch(opcaoMenu1){
                case 1:
                    System.out.println("Digite o Nome do Ativo:");
                    nome = ler.next();
                    System.out.println("Digite a Cotacao:");
                    ctc = ler.nextDouble();
                    System.out.println("Digite a precoLucro:");
                    pl = ler.nextDouble();
                    Acao a = new Acao(nome,ctc,pl);
                    listaAcoes.add(a);
                    break;
                case 2:
                    for (int i=0; i< listaAcoes.size(); i++) {
                        nome = listaAcoes.get(i).getTicker();
                        ctc = listaAcoes.get(i).getCotacao();
                        pl = listaAcoes.get(i).getPrecoLucro();
                        System.out.println("Código do Ativo:" + nome
                                + "\t Cotaçao do Ativo:" + ctc
                                + "\t Preço por Lucro:" + pl );
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do Ativo:");
                    nome = ler.next();
                    for (int i=0; i< listaAcoes.size(); i++) {
                        if (nome.contains(listaAcoes.get(i).getTicker())) {
                            do{
                                menu2();
                                opcaoMenu2 = ler.nextInt();
                                switch (opcaoMenu2){
                                    case 1:
                                        do {
                                            menu3();
                                            opcaoMenu3 = ler.nextInt();
                                            switch (opcaoMenu3){
                                                case 1:
                                                    System.out.println("Digite o novo nome da ação:");
                                                    nome = ler.next();
                                                    listaAcoes.get(i).setTicker(nome);
                                                    break;
                                                case 2:
                                                    System.out.println("Digite a nova cotacao do ação:");
                                                    ctc = ler.nextDouble();
                                                    listaAcoes.get(i).setCotacao(ctc);
                                                    break;
                                                case 3:
                                                    System.out.println("Digite o novo PL da ação:");
                                                    pl = ler.nextDouble();
                                                    listaAcoes.get(i).setPrecoLucro(pl);
                                                    break;
                                                case 0:
                                                    break;
                                            }
                                        }while(opcaoMenu3 != 0);
                                        break;
                                    case 2:
                                        listaAcoes.remove(i);
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            }while(opcaoMenu2 != 0);
                        } else {
                            System.out.println("Ação não encontrada!");
                        }
                    }
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcaoMenu1 != 0);
    }
}

