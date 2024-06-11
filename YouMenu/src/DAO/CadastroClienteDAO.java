package DAO;


import conexao.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;

public class CadastroClienteDAO extends DAO{
    
    public void salvar(Cliente cliente) {
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO `clientes`(`email`, `senha`, `cpf`, `nome`) VALUES(?,?,?,?)");
            comandoSQL.setString(1, cliente.getEmail());
            comandoSQL.setString(2, cliente.getSenha());
            comandoSQL.setString(3, cliente.getCPF());
            comandoSQL.setString(4, cliente.getNome());
            comandoSQL.execute();
            fechaConexao();
        } catch (Exception e) {

        }

    }
   
    public boolean loginUser(Cliente cliente){
        ResultSet rs = null;
        boolean check = false;
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM `clientes` WHERE `email` = ? and `senha` = ?");
            comandoSQL.setString(1, cliente.getEmail());
            comandoSQL.setString(2, cliente.getSenha());
            rs = comandoSQL.executeQuery();
                if(rs.next()){
                    check = true;
                }
            fechaConexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CadastroClienteDAO" + e);
        }
    return check;
    }
    
}
