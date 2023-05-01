import java.util.Scanner;

public class Menu {
    public static void executar(){
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        ContaBancaria [ ] contas = new ContaBancaria [ 10 ];
        int cadastrados = 0;
        int numeroConta;
        int i = 0;
        limpa();
        
        do{
            System.out.println("1- Cadastrar cliente");
            System.out.println("2- Consultar saldo");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5 - Transferir");
            System.out.print("Digite opção: ");
            opcao = sc.nextInt();
            limpa();

            switch (opcao) {
                case 1:
                    ContaBancaria cliente = new ContaBancaria();
                    System.out.print("Informe o nome: ");
                    cliente.setTitular(sc.next());
                    System.out.print("Informe o número da conta: ");
                    cliente.setNumeroConta(sc.nextInt());
                    sc.nextLine();
                    cliente.setSaldo(0);
                    System.out.println("Cliente cadastrado com sucesso!");
                    sc.nextLine();
                    contas[ cadastrados ] = cliente;
                    cadastrados++;
                    limpa();
                    break;
                
                case 2:
                    System.out.print("Informe sua conta: ");
                    numeroConta = sc.nextInt();
                    sc.nextLine();
                    for ( i = 0; i < contas.length; i++) {
                        if (contas[i] == null) {
                            System.out.println("Essa conta não existe.");
                            break;
                        }
                        ContaBancaria contaBancaria = contas[i];
                        if(numeroConta == contaBancaria.getNumeroConta()){
                            System.out.println("Seja bem vindo " + contaBancaria.getTitular());
                            System.out.println("Seu saldo é de: R$" + contaBancaria.getSaldo());
                            sc.nextLine();
                            limpa();

                            break;
                        }
                    }
                    
                    break;

                case 3:
                    System.out.print("Informe sua conta: ");
                    numeroConta = sc.nextInt();
                    sc.nextLine();
                    limpa();

                    for ( i = 0; i < contas.length; i++) {
                        if (contas[i] == null) {
                            System.out.println("Essa conta não existe.");
                            break;
                        }
                        ContaBancaria contaBancaria = contas[i];
                        if(numeroConta == contaBancaria.getNumeroConta()){
                            System.out.println("Seja bem vindo " + contaBancaria.getTitular());
                            System.out.print("Informe o valor do depósito: R$");
                            double valor = sc.nextDouble();
                            contaBancaria.setSaldo( contaBancaria.getSaldo() + valor );
                            sc.nextLine();
                            limpa();
    
                            break;
                    }
                }
                break;

                case 4:
                    System.out.print("Informe sua conta: ");
                    numeroConta = sc.nextInt();
                    sc.nextLine();
                    limpa();

                    if (contas[i] == null) {
                            System.out.println("Essa conta não existe.");
                            break;
                    }
                        ContaBancaria contaBancaria = contas[i];
                        if(numeroConta == contaBancaria.getNumeroConta()){
                            System.out.println("Seja bem vindo " + contaBancaria.getTitular());
                            System.out.println("Seu saldo atual é de: " + contaBancaria.getSaldo());

                            System.out.print("Informe o valor que deseja sacar: R$");
                            double valor = sc.nextDouble();
                                if( contaBancaria.getSaldo() > valor ){
                                    contaBancaria.setSaldo( contaBancaria.getSaldo() - valor );
                                }else{
                                    System.out.println("Saldo Insuficiente");
                                    sc.nextLine();
                            }
                            limpa();
                            

                            break;
                    }
                break;

                case 5:
                    /*System.out.print("Informe sua conta: ");
                    numeroConta = sc.nextInt();

                    System.out.println("Informe a conta que ira transferir");
                    numeroConta = sc.nextInt();
                    sc.nextLine();
                    limpa();

                    if (contas[i] == null) {
                        System.out.println("Essa conta não existe.");
                        break;
                    }
                    ContaBancaria contaBancaria = contas[i];
                        if(numeroConta == contaBancaria.getNumeroConta()){
                            System.out.println("Seja bem vindo " + contaBancaria.getTitular());
                            System.out.println("Seu saldo atual é de: " + contaBancaria.getSaldo());

                            System.out.print("Informe o valor que deseja sacar: R$");
                            double valor = sc.nextDouble();
                                if( contaBancaria.getSaldo() > valor ){
                                    contaBancaria.setSaldo( contaBancaria.getSaldo() - valor );
                                }else{
                                    System.out.println("Saldo Insuficiente");
                            }
                            sc.nextLine();
                            limpa();*/
                    break;

                default:
                    break;
            }

        } while( opcao != 0 );
        sc.close();
    }
    public static void limpa(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
