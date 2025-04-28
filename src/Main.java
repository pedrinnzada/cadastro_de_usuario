import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CADASTRO DE USUARIO
        System.out.println("DIGITE SEU USUARIO: ");
        String usuariocadastrar = sc.next();
        System.out.println("DIGITE SEU SENHA: ");
        String senhacadastrar = sc.next();
        System.out.println("DIGITE UM APELIDO: ");
        String apelido = sc.next();

        // CADASTRO FEITO
        System.out.println("----------CADASTRADADO COM SUCESSO!----------");

        // LOGIN DO USUARIO
        System.out.println("DIGITE SEU USUARIO: ");
        String usuario2 = sc.next();
        System.out.println("DIGITE SEU SENHA: ");
        String senhacadastrar2 = sc.next();

        // CONDICIONAL DO USUARIO
        if (usuariocadastrar.equalsIgnoreCase(usuario2) && senhacadastrar.equals(senhacadastrar2)){
            System.out.println("LOGIN FEITO COM SUCESSO");

            System.out.println("----------------------------------");
            System.out.println("OBRIGADO " + apelido.toUpperCase() + " PELO CADASTRO!!");


        } else {
            System.out.println("ERRO: LOGIN OU SENHA INCORRETA");
        }

    }
}