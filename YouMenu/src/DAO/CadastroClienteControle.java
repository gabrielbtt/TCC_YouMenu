package DAO;

import model.Cliente;

public class CadastroClienteControle {

    CadastroClienteDAO clienteDao = new CadastroClienteDAO();

    public void salvar(Cliente cliente) {
        clienteDao.salvar(cliente);
    }
    
    public void Login(Cliente cliente) {
        clienteDao.loginUser(cliente);
    }

}
