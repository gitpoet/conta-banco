import java.util.Scanner;

public class ContaTerminal1 {
    
    public static void main(String[] args) {

        String nome;
        String agencia;
        int conta;
        Double saldo;
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Por favor, digite o seu nome completo");
            nome = teclado.next();
            System.out.println("Por favor, digite o número da sua agência");
            agencia = teclado.next();
            System.out.println("Por favor, digite o número da sua conta");
            conta = teclado.nextInt();
            System.out.println("Por favor, digite o valor para depósito");
            saldo = teclado.nextDouble();
        

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + "já está diponível para saque.");


        
    }
}
