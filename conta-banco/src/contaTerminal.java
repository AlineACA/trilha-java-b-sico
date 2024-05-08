import java. util. Scanner; 

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Por favor informe nomeCliente: ");
            String nomeCliente = sc.next();
            System.out.println("Olá! "+nomeCliente+"Bem vindo!: ");
        
            System.out.println("Por favor informe a agência: ");
            String agencia = sc.next();
            System.out.println("Agência: "+agencia+"Pressione ENTER para confirmar: ");

            System.out.println("Por favor informe o número da conta: ");
            int numConta = sc.nextInt(); //variável alterada afim de melhor compreensão
            System.out.println("Agência: "+numConta+"Pressione Enter: ");
        
            System.out.println("Agora, Por favor informe o Saldo: ");
            double saldo = sc.nextDouble();
            System.out.println("Pressione ENTER");

            System.out.println("Olá! "+nomeCliente+" Obrigado(a) por criar uma conta em nosso banco, sua agência é, "+agencia+" conta "+numConta+" e seu saldo "+saldo+" já está disponível para saque.");


        

        // TODO: conhecer e importar a classe scanner O
        // exibir msgs pra users
        //obter valores digitados no terminal, classe scanner
        //exibir msg de sucesso
        
        





    }
}
