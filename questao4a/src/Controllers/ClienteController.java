package Controllers;

import DAO.ClienteDAO;
import Models.Cliente;
import Views.ClienteView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class ClienteController {

    private ClienteView view;
    private List<Cliente> models;
    private ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteController(){
        this.models = new ArrayList<>();
        this.view = new ClienteView(this);
    }

    public void start(){
        view.menu();
    }

    public Cliente cadastrar(String username, String nome, String sobrenome){
        Cliente newCliente = new Cliente(username,nome,sobrenome);
        newCliente.setId(getNewId());
        this.models.add(newCliente);
        clienteDAO.cadastrar(models);
        return newCliente;
    }

    private long getNewId() {
        long idMax = 0;
        for(Cliente cliente : models){
            idMax = max(idMax, cliente.getId());
        }
        return idMax +1;
    }


    public List<Cliente> listar(){
        return clienteDAO.listar();
    }
}
