package Views;
import Models.Cliente;
import Controllers.ClienteController;

import java.io.IOException;
import java.util.Scanner;

public class ClienteView {

    private ClienteController controller;

    public ClienteView(ClienteController controller) {
        this.controller = controller;
    }

    public void menu(){
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Selecionar");
            System.out.println("3 - Listar");

            int escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 0:
                    return;
                case 1:
                   menuCadastrar();
                    break;
                case 2:
                    //menuSelecionar();
                    break;
                case 3:
                    listaCliente();
                    break;

            }
        }
    }

    public void menuCadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Defina o nome de usuario");
        String username = ler.nextLine();

        System.out.println("Qual o nome?");
        String nome = ler.nextLine();

        System.out.println("Qual o sobrenome?");
        String sobrenome = ler.nextLine();

        Cliente newCliente = controller.cadastrar(username,nome,sobrenome);
        System.out.println("Cliente <" + newCliente.getUsername() + "> foi cadastrado\n");
        }

        private void listaCliente(){
             for (Cliente cliente: controller.getModels()){
                 System.out.printf("ID: %d | Username: %s | Nome: %s | Sobrenome: %s\n",
                    cliente.getId(), cliente.getUsername(), cliente.getNome(), cliente.getSobrenome());
        }



    }
}
