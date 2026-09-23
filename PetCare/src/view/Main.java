package view;

import controller.UsuarioController;
import model.dao.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UsuarioController usuarioController = new UsuarioController();

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Fazer Login \n2 - Criar Conta ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 2:

                System.out.println("Email: ");
                String email = sc.next();

                System.out.println("Senha: ");
                String senha = sc.next();

                Usuario usuario = new Usuario(email,senha,email,1);

                if (usuarioController.conectaBD("petcare")){
                    String NovoUsuario = usuarioController.InserirUsuario("usuario", usuario);

                    System.out.println(NovoUsuario);

                } else {
                    System.out.println("Não foi possível estabelecer conexão!");
                }
        }


    }
}
