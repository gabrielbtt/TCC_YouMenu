/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author Matheus
 */
public class CadastroFuncionarioDAO extends DAO{
    public void salvar(Funcionario restaurante) {
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO `funcionarios`(`nome`, `senha`) VALUES(?,?)");
            comandoSQL.setString(1, restaurante.getNome());
            comandoSQL.setString(2, restaurante.getSenha());
            comandoSQL.execute();
            fechaConexao();
        } catch (Exception e) {

        }

    }
    
    public boolean loginRestaurante(Funcionario restaurante){
        ResultSet rs = null;
        boolean check = false;
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM `funcionarios` WHERE `nome` = ? and `senha` = ?");
            comandoSQL.setString(1, restaurante.getNome());
            comandoSQL.setString(2, restaurante.getSenha());
            rs = comandoSQL.executeQuery();
                if(rs.next()){
                    check = true;
                }
            fechaConexao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CadastroFuncionariosDAO" + e);
        }
    return check;
    }
}
