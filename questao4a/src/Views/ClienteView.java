package Views;
import DAO.ClienteDAO;
import Models.Cliente;
import Controllers.ClienteController;

import java.io.IOException;
import java.util.List;
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
            System.out.println("2 - Selecionar Cliente");
            System.out.println("3 - Listar Clientes");

            int escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 0:
                    return;
                case 1:
                   menuCadastrar();
                    break;
                case 2:

                    break;
                case 3:
                    menuListar();
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


        public void menuListar(){
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.carregar();
            clienteDAO.listar();

            List<Cliente> clientesCadastrados = controller.listar();
            for (int i =0; i < clientesCadastrados.size(); i++) {
                System.out.println( "ID: " + i +
                        " | " + clientesCadastrados.get(i).getUsername() +
                        " | " + clientesCadastrados.get(i).getNome() +
                        " | " + clientesCadastrados.get(i).getSobrenome() );
            }


        }


}
